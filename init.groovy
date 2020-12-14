import jenkins.model.*
import hudson.security.*
import jenkins.install.InstallState
import java.util.logging.Logger

def instance = Jenkins.getInstance()

/**println "--> creating local user 'admin'"
def user = instance.getSecurityRealm().createAccount('admin', 'someAdminPass')
user.save()
def strategy = new FullControlOnceLoggedInAuthorizationStrategy()
strategy.setAllowAnonymousRead(true)
instance.setAuthorizationStrategy(strategy)
*/
//
def logger = Logger.getLogger("")
def installed = false
def initialized = false
//def pluginParameter="bouncycastle-api        cloudbees-folder        config-file-provider    credentials     display-url-api envinject-api   envinject       git-client      git     github-api      github  gradle  junit   mailer  matrix-project  plain-credentials       scm-api script-security ssh-credentials structs token-macro     workflow-scm-step      workflow-step-api        job-dsl         ant     antisamy-markup-formatter       bouncycastle-api        command-launcher        credentials     cvs     display-url-apiexternal-monitor-job     javadoc jdk-tool        junit   ldap    mailer  matrix-auth     matrix-project  maven-plugin    pam-auth        script-security ssh-credentialsssh-slaves       subversion      translation     windows-slaves     postbuildscript email-ext       workflow-support        workflow-job    ghprb   permissive-script-security"
def pluginParameter="bouncycastle-api        cloudbees-folder        config-file-provider    credentials     display-url-api envinject-api   envinject       git-client      git     github-api      github  gradle  junit   mailer  matrix-project  plain-credentials       scm-api script-security ssh-credentials structs token-macro     workflow-scm-step      workflow-step-api        job-dsl         ant     antisamy-markup-formatter       bouncycastle-api        command-launcher        credentials     cvs     display-url-apiexternal-monitor-job     javadoc jdk-tool        junit   ldap    mailer  matrix-auth     matrix-project  maven-plugin    pam-auth        script-security ssh-credentialsssh-slaves       subversion      translation     windows-slaves	postbuildscript	email-ext	workflow-support	workflow-job	ghprb	permissive-script-security pipeline-build-step     jsch    pipeline-milestone-step jquery-detached jackson2-api    ace-editor      pipeline-input-step     workflow-support        git-client     workflow-cps     pipeline-model-api      pipeline-stage-step     git-server      workflow-job    credentials-binding     pipeline-graph-analysis pipeline-rest-api      handlebars       branch-api      momentjs        pipeline-stage-view     pipeline-model-extensions       apache-httpcomponents-client-4-api      workflow-cps-global-libworkflow-multibranch     authentication-tokens   docker-commons  durable-task    workflow-durable-task-step      workflow-basic-steps    docker-workflow pipeline-stage-tags-metadata    pipeline-model-declarative-agent        pipeline-model-definition       workflow-aggregator groovy"
def plugins = pluginParameter.split()
logger.info("" + plugins)
def pm = instance.getPluginManager()
def uc = instance.getUpdateCenter()
plugins.each {
  logger.info("Checking " + it)
  if (!pm.getPlugin(it)) {
    logger.info("Looking UpdateCenter for " + it)
    if (!initialized) {
      uc.updateAllSites()
      initialized = true
    }
    def plugin = uc.getPlugin(it)
    if (plugin) {
      logger.info("Installing " + it)
    	def installFuture = plugin.deploy()
      while(!installFuture.isDone()) {
        logger.info("Waiting for plugin install: " + it)
        sleep(3000)
      }
      installed = true
    }
  }
}

if (installed) {
  logger.info("Plugins installed, initializing a restart!")
  instance.save()
  instance.restart()
} else{
//def instance = Jenkins.getInstance()
//def secjenkins = Jenkins.instance
def hudsonRealm = new HudsonPrivateSecurityRealm(false)
hudsonRealm.createAccount('admin', 'someAdminPass')
instance.setSecurityRealm(hudsonRealm)
def strategy = new FullControlOnceLoggedInAuthorizationStrategy()
strategy.setAllowAnonymousRead(false)
instance.setAuthorizationStrategy(strategy)
instance.save()
}

if (!instance.installState.isSetupComplete()) {
  println '--> Neutering SetupWizard'
  InstallState.INITIAL_SETUP_COMPLETED.initializeState()
}

import org.jenkinsci.plugins.scriptsecurity.scripts.*
import org.jenkinsci.plugins.workflow.job.WorkflowJob;
import org.jenkinsci.plugins.scriptsecurity.sandbox.Whitelist;
import org.jenkinsci.plugins.scriptsecurity.sandbox.whitelists.BlanketWhitelist;
import hudson.model.FreeStyleProject;
import hudson.plugins.git.GitSCM;
import hudson.plugins.git.BranchSpec;
import com.cloudbees.jenkins.*;
import hudson.triggers.SCMTrigger;
import javaposse.jobdsl.plugin.ExecuteDslScripts;
import org.jenkinsci.plugins.scriptsecurity.scripts.*
import org.jenkinsci.plugins.scriptsecurity.scripts.languages.GroovyLanguage

jenkins = Jenkins.instance;
jenkins.getExtensionList(Whitelist.class).push(new BlanketWhitelist());
jobName = "seed";
gitTrigger = new SCMTrigger("* * * * *");
dslBuilder = new ExecuteDslScripts();
dslBuilder.targets = 'dsl.groovy'
dslProject = new hudson.model.FreeStyleProject(jenkins, jobName);
dslProject.scm = new GitSCM("https://github.com/srimandarbha/dsl.git");
dslProject.scm.doGenerateSubmoduleConfigurations = true;
dslProject.scm.branches = [new BranchSpec("*/master")];
dslProject.addTrigger(gitTrigger);
dslProject.createTransientActions();
dslProject.getPublishersList().add(dslBuilder);
//
final ScriptApproval sa = ScriptApproval.get();
String script = new File('/var/lib/jenkins/dsl.groovy').text
ScriptApproval.PendingScript s = new ScriptApproval.PendingScript(script, GroovyLanguage.get(), ApprovalContext.create())
sa.approveScript(s.getHash())
//
jenkins.add(dslProject, jobName);
gitTrigger.start(dslProject, true);

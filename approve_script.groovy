import org.jenkinsci.plugins.scriptsecurity.scripts.*
import org.jenkinsci.plugins.scriptsecurity.scripts.languages.*

final ScriptApproval sa = ScriptApproval.get();

String script = new File('dsl.groovy').text

ScriptApproval.PendingScript s = new ScriptApproval.PendingScript(script, GroovyLanguage.get(), ApprovalContext.create())

sa.approveScript(s.getHash())

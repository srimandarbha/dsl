job("accounts") {
	description("accounts puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/accounts.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/accounts/')
		}
	}
}

job("activemq") {
	description("activemq puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/activemq.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/activemq/')
		}
	}
}

job("admins") {
	description("admins puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/admins.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/admins/')
		}
	}
}

job("alchemy") {
	description("alchemy puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/alchemy.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/alchemy/')
		}
	}
}

job("alternatives") {
	description("alternatives puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/alternatives.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/alternatives/')
		}
	}
}

job("analytics") {
	description("analytics puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/analytics.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/analytics/')
		}
	}
}

job("ansible") {
	description("ansible puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/ansible.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/ansible/')
		}
	}
}

job("apache") {
	description("apache puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/apache.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/apache/')
		}
	}
}

job("apt") {
	description("apt puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/apt.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/apt/')
		}
	}
}

job("asm") {
	description("asm puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/asm.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/asm/')
		}
	}
}

job("asterlib") {
	description("asterlib puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/asterlib.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/asterlib/')
		}
	}
}

job("auditd") {
	description("auditd puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/auditd.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/auditd/')
		}
	}
}

job("augeas") {
	description("augeas puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/augeas.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/augeas/')
		}
	}
}

job("augeasproviders_core") {
	description("augeasproviders_core puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/augeasproviders_core.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/augeasproviders_core/')
		}
	}
}

job("augeasproviders_grub") {
	description("augeasproviders_grub puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/augeasproviders_grub.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/augeasproviders_grub/')
		}
	}
}

job("augeasproviders_mounttab") {
	description("augeasproviders_mounttab puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/augeasproviders_mounttab.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/augeasproviders_mounttab/')
		}
	}
}

job("augeasproviders_pam") {
	description("augeasproviders_pam puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/augeasproviders_pam.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/augeasproviders_pam/')
		}
	}
}

job("augeasproviders_shellvar") {
	description("augeasproviders_shellvar puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/augeasproviders_shellvar.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/augeasproviders_shellvar/')
		}
	}
}

job("augeasproviders_ssh") {
	description("augeasproviders_ssh puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/augeasproviders_ssh.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/augeasproviders_ssh/')
		}
	}
}

job("augeasproviders_sysctl") {
	description("augeasproviders_sysctl puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/augeasproviders_sysctl.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/augeasproviders_sysctl/')
		}
	}
}

job("auth") {
	description("auth puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/auth.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/auth/')
		}
	}
}

job("autosys") {
	description("autosys puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/autosys.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/autosys/')
		}
	}
}

job("avahi") {
	description("avahi puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/avahi.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/avahi/')
		}
	}
}

job("azadmin") {
	description("azadmin puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/azadmin.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/azadmin/')
		}
	}
}

job("backup") {
	description("backup puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/backup.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/backup/')
		}
	}
}

job("base") {
	description("base puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/base.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/base/')
		}
	}
}

job("bash") {
	description("bash puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/bash.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/bash/')
		}
	}
}

job("bncloud_build") {
	description("bncloud_build puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/bncloud_build.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/bncloud_build/')
		}
	}
}

job("bookelf") {
	description("bookelf puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/bookelf.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/bookelf/')
		}
	}
}

job("build") {
	description("build puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/build.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/build/')
		}
	}
}

job("catalog") {
	description("catalog puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/catalog.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/catalog/')
		}
	}
}

job("cdpr") {
	description("cdpr puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/cdpr.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/cdpr/')
		}
	}
}

job("clone_puppet_module_template") {
	description("{{ module_name }} puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/{{ module_name }}.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/{{ module_name }}/')
		}
	}
}

job("cognizant") {
	description("cognizant puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/cognizant.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/cognizant/')
			displayName()
		}
	}
}

job("concat") {
	description("concat puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/concat.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/concat/')
		}
	}
}

job("content") {
	description("content puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/content.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/content/')
		}
	}
}

job("cron") {
	description("cron puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/cron.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/cron/')
		}
	}
}

job("dba") {
	description("dba puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/dba.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/dba/')
		}
	}
}

job("deployuser") {
	description("deployuser puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/deployuser.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/deployuser/')
		}
	}
}

job("devel") {
	description("devel puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/devel.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/devel/')
		}
	}
}

job("devtools") {
	description("devtools puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/devtools.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/devtools/')
		}
	}
}

job("dhclient") {
	description("dhclient puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/dhclient.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/dhclient/')
		}
	}
}

job("docker") {
	description("docker puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/docker.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/docker/')
		}
	}
}

job("docker_test") {
	keepDependencies(false)
	disabled(false)
	concurrentBuild(false)
}

job("eai") {
	description("eai puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/eai.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/eai/')
		}
	}
}

job("eclipse_jetty") {
	description("eclipse_jetty puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/eclipse_jetty.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/eclipse_jetty/')
		}
	}
}

job("ejabberd") {
	description("ejabberd puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/ejabberd.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/ejabberd/')
		}
	}
}

job("emacs") {
	description("emacs puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/emacs.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/emacs/')
		}
	}
}

job("facter") {
	description("facter puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/facter.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/facter/')
		}
	}
}

job("fooacl") {
	description("fooacl puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/fooacl.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/fooacl/')
		}
	}
}

job("ganglia") {
	description("ganglia puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/ganglia.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/ganglia/')
		}
	}
}

job("grub") {
	description("grub puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/grub.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/grub/')
		}
	}
}

job("hadoop") {
	description("hadoop puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/hadoop.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/hadoop/')
		}
	}
}

job("hadoop_ba") {
	description("hadoop_ba puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/hadoop_ba.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/hadoop_ba/')
		}
	}
}

job("hal") {
	description("hal puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/hal.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/hal/')
		}
	}
}

job("hangtimer") {
	description("hangtimer puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/hangtimer.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/hangtimer/')
		}
	}
}

job("httpd") {
	description("httpd puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/httpd.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/httpd/')
		}
	}
}

job("hwinfo") {
	description("hwinfo puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/hwinfo.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/hwinfo/')
		}
	}
}

job("iftop") {
	description("iftop puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/iftop.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/iftop/')
		}
	}
}

job("imap") {
	description("imap puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/imap.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/imap/')
		}
	}
}

job("infiniband") {
	description("infiniband puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/infiniband.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/infiniband/')
		}
	}
}

job("infosec") {
	description("infosec puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/infosec.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/infosec/')
		}
	}
}

job("ingestionqauser") {
	description("ingestionqauser puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/ingestionqauser.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/ingestionqauser/')
		}
	}
}

job("init") {
	description("init puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/init.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/init/')
		}
	}
}

job("iotop") {
	description("iotop puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/iotop.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/iotop/')
		}
	}
}

job("iproute2") {
	description("iproute2 puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/iproute2.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/iproute2/')
		}
	}
}

job("iptables") {
	description("iptables puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/iptables.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/iptables/')
		}
	}
}

job("iscsi") {
	description("iscsi puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/iscsi.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/iscsi/')
		}
	}
}

job("jenkins") {
	description("jenkins puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/jenkins.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/jenkins/')
		}
	}
}

job("jetty") {
	description("jetty puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/jetty.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/jetty/')
		}
	}
}

job("jira") {
	description("jira puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/jira.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/jira/')
		}
	}
}

job("kerberos") {
	description("kerberos puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/kerberos.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/kerberos/')
		}
	}
}

job("kernel") {
	description("kernel puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/kernel.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/kernel/')
		}
	}
}

job("kvm") {
	description("kvm puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/kvm.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/kvm/')
		}
	}
}

job("lansweeper") {
	description("lansweeper puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/lansweeper.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/lansweeper/')
		}
	}
}

job("lem") {
	description("lem puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/lem.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/lem/')
		}
	}
}

job("libaio") {
	description("libaio puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/libaio.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/libaio/')
		}
	}
}

job("libxp") {
	description("libxp puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/libxp.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/libxp/')
		}
	}
}

job("lms") {
	description("lms puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/lms.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/lms/')
		}
	}
}

job("logrotate") {
	description("logrotate puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/logrotate.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/logrotate/')
		}
	}
}

job("lynx") {
	description("lynx puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/lynx.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/lynx/')
		}
	}
}

job("man") {
	description("man puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/man.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/man/')
		}
	}
}

job("marketing") {
	description("marketing puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/marketing.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/marketing/')
		}
	}
}

job("mcollective") {
	description("mcollective puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/mcollective.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/mcollective/')
		}
	}
}

job("memcached") {
	description("memcached puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/memcached.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/memcached/')
		}
	}
}

job("mobile") {
	description("mobile puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/mobile.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/mobile/')
		}
	}
}

job("modprobe") {
	description("modprobe puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/modprobe.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/modprobe/')
		}
	}
}

job("mongo") {
	description("mongo puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/mongo.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/mongo/')
		}
	}
}

job("mount_providers") {
	description("mount_providers puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/mount_providers.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/mount_providers/')
		}
	}
}

job("multipath") {
	description("multipath puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/multipath.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/multipath/')
		}
	}
}

job("munin") {
	description("munin puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/munin.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/munin/')
		}
	}
}

job("mutual_trust") {
	description("mutual_trust puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/mutual_trust.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/mutual_trust/')
		}
	}
}

job("mysql") {
	description("mysql puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/mysql.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/mysql/')
		}
	}
}

job("nagios") {
	description("nagios puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/nagios.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/nagios/')
		}
	}
}

job("nagiosftp") {
	description("nagiosftp puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/nagiosftp.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/nagiosftp/')
		}
	}
}

job("named") {
	description("named puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/named.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/named/')
		}
	}
}

job("neolane") {
	description("neolane puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/neolane.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/neolane/')
		}
	}
}

job("netdisco") {
	description("netdisco puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/netdisco.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/netdisco/')
		}
	}
}

job("network") {
	description("network puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/network.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/network/')
		}
	}
}

job("nfs") {
	description("nfs puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/nfs.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/nfs/')
		}
	}
}

job("nginx") {
	description("nginx puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/nginx.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/nginx/')
		}
	}
}

job("nook") {
	description("nook puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/nook.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/nook/')
		}
	}
}

job("nookcloudops") {
	description("nookcloudops puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/nookcloudops.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/nookcloudops/')
		}
	}
}

job("nookpress") {
	description("nookpress puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/nookpress.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/nookpress/')
		}
	}
}

job("nookre") {
	description("nookre puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/nookre.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/nookre/')
		}
	}
}

job("nscd") {
	description("nscd puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/nscd.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/nscd/')
		}
	}
}

job("ntp") {
	description("ntp puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/ntp.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/ntp/')
		}
	}
}

job("onix") {
	description("onix puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/onix.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/onix/')
		}
	}
}

job("openldap") {
	description("openldap puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/openldap.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/openldap/')
		}
	}
}

job("openssl") {
	description("openssl puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/openssl.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/openssl/')
		}
	}
}

job("oracle") {
	description("oracle puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/oracle.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/oracle/')
		}
	}
}

job("oracle_instantclient") {
	description("oracle_instantclient puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/oracle_instantclient.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/oracle_instantclient/')
		}
	}
}

job("oracle_jdk") {
	description("oracle_jdk puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/oracle_jdk.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/oracle_jdk/')
		}
	}
}

job("oraclejava") {
	description("oraclejava puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/oraclejava.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/oraclejava/')
		}
	}
}

job("os") {
	description("os puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/os.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/os/')
		}
	}
}

job("os_r10k") {
	description("os r10k")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Configuration/ospuppet_r10k.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	publishers {
		postBuildScripts {
			steps {
				shell("/var/lib/jenkins/scripts/ospuppet_r10k.py -f && /var/lib/jenkins/scripts/ospuppet_r10k.py -p && /var/lib/jenkins/scripts/ospuppet_r10k.py")
			}
			onlyIfBuildSucceeds(true)
			onlyIfBuildFails(false)
			markBuildUnstable(false)
		}
		extendedEmail {
			recipientList("\$DEFAULT_RECIPIENTS")
			contentType("default")
			defaultSubject("\$DEFAULT_SUBJECT")
			defaultContent("\$DEFAULT_CONTENT")
			attachmentPatterns()
			preSendScript("\$DEFAULT_PRESEND_SCRIPT")
			attachBuildLog(true)
			compressBuildLog(false)
			replyToList("\$DEFAULT_REPLYTO")
			saveToWorkspace(false)
			disabled(false)
		}
	}
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Configuration/ospuppet_r10k/')
		}
	}
}

job("ossec") {
	description("ossec puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/ossec.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/ossec/')
		}
	}
}

job("packageupdate") {
	description("packageupdate puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/packageupdate.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/packageupdate/')
		}
	}
}

job("pci") {
	description("pci puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/pci.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/pci/')
		}
	}
}

job("pcsc") {
	description("pcsc puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/pcsc.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/pcsc/')
		}
	}
}

job("pe") {
	description("pe puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/pe.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/pe/')
		}
	}
}

job("pe_accounts") {
	description("pe_accounts puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/pe_accounts.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/pe_accounts/')
		}
	}
}

job("pentaho") {
	description("pentaho puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/pentaho.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/pentaho/')
		}
	}
}

job("perfeng") {
	description("perfeng puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/perfeng.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/perfeng/')
		}
	}
}

job("phantom") {
	description("phantom puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/phantom.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/phantom/')
		}
	}
}

job("php") {
	description("php puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/php.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/php/')
		}
	}
}

job("php_remi") {
	description("php_remi puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/php_remi.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/php_remi/')
		}
	}
}

job("pnjmasterns01_named") {
	description("""
""")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-sysadmin/pnjmasterns01_named.git", "ssh")
			}
			branch("*/master")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	publishers {
		extendedEmail {
			recipientList("digitallinuxadmins@book.com, acole@book.com")
			contentType("default")
			defaultSubject("\$DEFAULT_SUBJECT")
			defaultContent("""Committer:
\${CHANGES, format="%a "}

Commit Message:
\${CHANGES, format="%m"}

\$DEFAULT_CONTENT""")
			attachmentPatterns()
			preSendScript("\$DEFAULT_PRESEND_SCRIPT")
			attachBuildLog(true)
			compressBuildLog(false)
			replyToList("\$DEFAULT_REPLYTO")
			saveToWorkspace(false)
			disabled(false)
		}
		githubCommitNotifier()
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('10')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https@bnjgit01.barnesandnoble.com:BN-sysadmin/pnjmasterns01_named_etc.git/')
		}
	}
}

job("port") {
	description("port puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/port.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/port/')
		}
	}
}

job("portmap") {
	description("portmap puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/portmap.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/portmap/')
		}
	}
}

job("postfix") {
	description("postfix puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/postfix.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/postfix/')
		}
	}
}

job("postgres") {
	description("postgres puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/postgres.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/postgres/')
		}
	}
}

job("profiled") {
	description("profiled puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/profiled.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/profiled/')
		}
	}
}

job("profiles") {
	description("profiles puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/profiles.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/profiles/')
		}
	}
}

job("proxy") {
	description("proxy puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/proxy.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/proxy/')
		}
	}
}

job("psp") {
	description("psp puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/psp.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/psp/')
		}
	}
}

job("puppet") {
	description("puppet puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/puppet.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/puppet/')
		}
	}
}

job("puppet_agent") {
	description("puppet_agent puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/puppet_agent.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/puppet_agent/')
		}
	}
}

job("puppet_hiera") {
	description("puppet_hiera")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Configuration/hiera.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	publishers {
		postBuildScripts {
			steps {
				shell("/var/lib/jenkins/scripts/ospuppet_r10k.py -f")
			}
			onlyIfBuildSucceeds(true)
			onlyIfBuildFails(false)
			markBuildUnstable(false)
		}
		extendedEmail {
			recipientList("\$DEFAULT_RECIPIENTS")
			contentType("default")
			defaultSubject("\$DEFAULT_SUBJECT")
			defaultContent("\$DEFAULT_CONTENT")
			attachmentPatterns()
			preSendScript("\$DEFAULT_PRESEND_SCRIPT")
			attachBuildLog(true)
			compressBuildLog(false)
			replyToList("\$DEFAULT_REPLYTO")
			saveToWorkspace(false)
			disabled(false)
		}
	}
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Configuration/hiera/')
		}
	}
}

job("puppet_manifests") {
	description("puppet_manifests")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Configuration/manifests.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	publishers {
		postBuildScripts {
			steps {
				shell("/var/lib/jenkins/scripts/ospuppet_r10k.py -f")
			}
			onlyIfBuildSucceeds(true)
			onlyIfBuildFails(false)
			markBuildUnstable(false)
		}
		extendedEmail {
			recipientList("\$DEFAULT_RECIPIENTS")
			contentType("default")
			defaultSubject("\$DEFAULT_SUBJECT")
			defaultContent("\$DEFAULT_CONTENT")
			attachmentPatterns()
			preSendScript("\$DEFAULT_PRESEND_SCRIPT")
			attachBuildLog(true)
			compressBuildLog(false)
			replyToList("\$DEFAULT_REPLYTO")
			saveToWorkspace(false)
			disabled(false)
		}
	}
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Configuration/manifests/')
		}
	}
}

job("puppet_module_template") {
	description("Puppet Module Template")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	disabled(false)
	concurrentBuild(false)
	steps {
		shell("""for file in \$(find . -iname '*.pp')
do
  puppet parser validate \\
    --render-as s \\
    --modulepath=modules \\
    "\$file" || exit 1;
done""")
		shell("""for file in \$(find . -iname '*.pp')
do
  puppet-lint --no-80chars-check --no-autoloader_layout-check --log-format "%{path}:%{linenumber}:%{check}:%{KIND}:%{message}" "\$file"
done""")
	}
	publishers {
		postBuildScripts {
			steps {
				shell("/var/lib/jenkins/scripts/ospuppet_r10k.py -m \${JOB_NAME_FOR_POST_BUILD}")
			}
			onlyIfBuildSucceeds(true)
			onlyIfBuildFails(false)
			markBuildUnstable(false)
		}
		extendedEmail {
			recipientList("\$DEFAULT_RECIPIENTS")
			contentType("default")
			defaultSubject("\$DEFAULT_SUBJECT")
			defaultContent("""Committer:
\${CHANGES, format="%a "}

Commit Message:
\${CHANGES, format="%m"}

\$DEFAULT_CONTENT""")
			attachmentPatterns()
			preSendScript("\$DEFAULT_PRESEND_SCRIPT")
			attachBuildLog(true)
			compressBuildLog(false)
			replyToList("\$DEFAULT_REPLYTO")
			saveToWorkspace(false)
			disabled(false)
		}
		githubCommitNotifier()
	}
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
}

job("puppetdbquery") {
	description("puppetdbquery puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/puppetdbquery.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/puppetdbquery/')
		}
	}
}

job("puppi") {
	description("puppi puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/puppi.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/puppi/')
		}
	}
}

job("python") {
	description("python puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/python.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/python/')
		}
	}
}

job("radius") {
	description("radius puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/radius.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/radius/')
		}
	}
}

job("rasupport") {
	description("rasupport puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/rasupport.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/rasupport/')
		}
	}
}

job("relengineering") {
	description("relengineering puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/relengineering.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/relengineering/')
		}
	}
}

job("repo") {
	description("repo puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/repo.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/repo/')
		}
	}
}

job("resolv") {
	description("resolv puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/resolv.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/resolv/')
		}
	}
}

job("resourcespace") {
	description("resourcespace puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/resourcespace.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/resourcespace/')
		}
	}
}

job("riak") {
	description("riak puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/riak.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/riak/')
		}
	}
}

job("roles") {
	description("roles puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/roles.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/roles/')
		}
	}
}

job("root") {
	description("root puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/root.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/root/')
		}
	}
}

job("rrdclient") {
	description("rrdclient puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/rrdclient.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/rrdclient/')
		}
	}
}

job("rstatd") {
	description("rstatd puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/rstatd.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/rstatd/')
		}
	}
}

job("rsyslog") {
	description("rsyslog puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/rsyslog.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/rsyslog/')
		}
	}
}

job("rsyslog_jetty") {
	description("rsyslog_jetty puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/rsyslog_jetty.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/rsyslog_jetty/')
		}
	}
}

job("rsyslog_nagios") {
	description("rsyslog_nagios puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/rsyslog_nagios.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/rsyslog_nagios/')
		}
	}
}

job("samba") {
	description("samba puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/samba.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/samba/')
		}
	}
}

job("sap") {
	description("sap puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/sap.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/sap/')
		}
	}
}

job("scm") {
	description("scm puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/scm.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/scm/')
		}
	}
}

job("scripts") {
	description("scripts puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/scripts.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/scripts/')
		}
	}
}

job("search") {
	description("search puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/search.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/search/')
		}
	}
}

job("secgrp") {
	description("secgrp puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/secgrp.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/secgrp/')
		}
	}
}

job("selinux") {
	description("selinux puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/selinux.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/selinux/')
		}
	}
}

job("sendmail") {
	description("sendmail puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/sendmail.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/sendmail/')
		}
	}
}

job("shells") {
	description("shells puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/shells.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/shells/')
		}
	}
}

job("smokeping") {
	description("smokeping puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/smokeping.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/smokeping/')
		}
	}
}

job("snmp") {
	description("snmp puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/snmp.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/snmp/')
		}
	}
}

job("sparknotes") {
	description("sparknotes puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/sparknotes.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/sparknotes/')
		}
	}
}

job("ssh") {
	description("ssh puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/ssh.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/ssh/')
		}
	}
}

job("ssl_certs") {
	description("ssl_certs puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/ssl_certs.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/ssl_certs/')
		}
	}
}

job("sssd") {
	description("sssd puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/sssd.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/sssd/')
		}
	}
}

job("stdlib") {
	description("stdlib puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/stdlib.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/stdlib/')
		}
	}
}

job("storage") {
	description("storage puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/storage.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/storage/')
		}
	}
}

job("string") {
	description("string puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/string.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/string/')
		}
	}
}

job("subversion") {
	description("subversion puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/subversion.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/subversion/')
		}
	}
}

job("sudo") {
	description("sudo puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/sudo.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/sudo/')
		}
	}
}

job("sudoer") {
	description("sudoer puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/sudoer.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/sudoer/')
		}
	}
}

job("sudoers") {
	description("sudoers puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/sudoers.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/sudoers/')
		}
	}
}

job("sunjdk") {
	description("sunjdk puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/sunjdk.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/sunjdk/')
		}
	}
}

job("symantec") {
	description("symantec puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/symantec.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/symantec/')
		}
	}
}

job("sysstat") {
	description("sysstat puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/sysstat.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/sysstat/')
		}
	}
}

job("systemd") {
	description("systemd puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/systemd.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/systemd/')
		}
	}
}

job("testing") {
	description("testing puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/testing.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/testing/')
		}
	}
}

job("tikweb") {
	description("tikweb puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/tikweb.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/tikweb/')
		}
	}
}

job("timesten") {
	description("timesten puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/timesten.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/timesten/')
		}
	}
}

job("timesync") {
	description("timesync puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/timesync.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/timesync/')
		}
	}
}

job("timezone") {
	description("timezone puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/timezone.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/timezone/')
		}
	}
}

job("tomcat6") {
	description("tomcat6 puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/tomcat6.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/tomcat6/')
		}
	}
}

job("tomcat7") {
	description("tomcat7 puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/tomcat7.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/tomcat7/')
		}
	}
}

job("tsm") {
	description("tsm puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/tsm.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/tsm/')
		}
	}
}

job("ulimit") {
	description("ulimit puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/ulimit.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/ulimit/')
		}
	}
}

job("unixodbc") {
	description("unixodbc puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/unixodbc.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/unixodbc/')
		}
	}
}

job("user_commands") {
	description("user_commands puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/user_commands.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/user_commands/')
		}
	}
}

job("users") {
	description("users puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/users.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/users/')
		}
	}
}

job("uuidd") {
	description("uuidd puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/uuidd.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/uuidd/')
		}
	}
}

job("vcsrepo") {
	description("vcsrepo puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/vcsrepo.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/vcsrepo/')
		}
	}
}

job("virtual") {
	description("virtual puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/virtual.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/virtual/')
		}
	}
}

job("vmware_guest") {
	description("vmware_guest puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/vmware_guest.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/vmware_guest/')
		}
	}
}

job("vmware_puppetfact") {
	description("vmware_puppetfact puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/vmware_puppetfact.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/vmware_puppetfact/')
		}
	}
}

job("vmwaretools") {
	description("vmwaretools puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/vmwaretools.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/vmwaretools/')
		}
	}
}

job("vnc") {
	description("vnc puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/vnc.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/vnc/')
		}
	}
}

job("vsftp") {
	description("vsftp puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/vsftp.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/vsftp/')
		}
	}
}

job("webinst") {
	description("webinst puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/webinst.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/webinst/')
		}
	}
}

job("wget") {
	description("wget puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/wget.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/wget/')
		}
	}
}

job("x11") {
	description("x11 puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/x11.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/x11/')
		}
	}
}

job("xen") {
	description("xen puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/xen.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/xen/')
		}
	}
}

job("xenguest") {
	description("xenguest puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/xenguest.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/xenguest/')
		}
	}
}

job("xfs") {
	description("xfs puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/xfs.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/xfs/')
		}
	}
}

job("xinetd") {
	description("xinetd puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/xinetd.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/xinetd/')
		}
	}
}

job("xtrabackup") {
	description("xtrabackup puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/xtrabackup.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/xtrabackup/')
		}
	}
}

job("yaml") {
	description("yaml puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/yaml.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/yaml/')
		}
	}
}

job("yum") {
	description("yum puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/yum.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/yum/')
		}
	}
}

job("zlib") {
	description("zlib puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/zlib.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/zlib/')
		}
	}
}

job("zzz_ssh") {
	description("zzz_ssh puppet module")
	keepDependencies(false)
	environmentVariables {
		loadFilesFromMaster(false)
		keepSystemVariables(true)
		keepBuildVariables(true)
		overrideBuildParameters(false)
	}
	scm {
		git {
			remote {
				github("git@bnjgit01.barnesandnoble.com:BN-Puppet-Modules/zzz_ssh.git", "ssh")
			}
			branch("**")
		}
	}
	disabled(false)
	triggers {
		githubPush()
	}
	concurrentBuild(false)
	wrappers {
		environmentVariables {
			env("JOB_NAME_FOR_POST_BUILD", "\${JOB_NAME}")
		}
	}
	configure {
		it / 'properties' / 'jenkins.model.BuildDiscarderProperty' {
			strategy {
				'daysToKeep'('-1')
				'numToKeep'('3')
				'artifactDaysToKeep'('-1')
				'artifactNumToKeep'('-1')
			}
		}
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://bnjgit01.barnesandnoble.com/BN-Puppet-Modules/zzz_ssh/')
		}
	}
}

listView("DNS") {
        jobs {
                name("pnjmasterns01_named")
        }
        columns {
                status()
                weather()
                name()
                lastSuccess()
                lastFailure()
                lastDuration()
                buildButton()
        }
}

listView("Templates") {
        jobs {
                name("clone_puppet_module_template")
                name("puppet_module_template")
        }
        columns {
                status()
                weather()
                name()
                lastSuccess()
                lastFailure()
                lastDuration()
                buildButton()
        }
}

listView("Puppet") {
        jobs {
                name("accounts")
                name("activemq")
                name("admins")
                name("alchemy")
                name("alternatives")
                name("analytics")
                name("ansible")
                name("apache")
                name("apt")
                name("asm")
                name("asterlib")
                name("auditd")
                name("augeas")
                name("augeasproviders_core")
                name("augeasproviders_grub")
                name("augeasproviders_mounttab")
                name("augeasproviders_sysctl")
                name("auth")
                name("autosys")
                name("avahi")
                name("azadmin")
                name("backup")
                name("base")
                name("bash")
                name("bncloud_build")
                name("bookelf")
                name("catalog")
                name("cdpr")
                name("cognizant")
                name("concat")
                name("content")
                name("cron")
                name("dba")
                name("deployuser")
                name("devel")
                name("devtools")
                name("dhclient")
                name("docker")
                name("eai")
                name("eclipse_jetty")
                name("ejabberd")
                name("emacs")
                name("facter")
                name("fooacl")
                name("ganglia")
                name("grub")
                name("hadoop")
                name("hadoop_ba")
                name("hal")
                name("hangtimer")
                name("httpd")
                name("hwinfo")
                name("iftop")
                name("imap")
                name("infiniband")
                name("infosec")
                name("ingestionqauser")
                name("init")
                name("iotop")
                name("iproute2")
                name("iptables")
                name("iscsi")
                name("jenkins")
                name("jetty")
                name("jira")
                name("kerberos")
                name("kernel")
                name("kvm")
                name("lansweeper")
                name("lem")
                name("libaio")
                name("libxp")
                name("lms")
                name("logrotate")
                name("lynx")
                name("man")
                name("marketing")
                name("mcollective")
                name("memcached")
                name("mobile")
                name("modprobe")
                name("mongo")
                name("mount_providers")
                name("multipath")
                name("mutual_trust")
                name("mysql")
                name("nagios")
                name("nagiosftp")
                name("named")
                name("neolane")
                name("netdisco")
                name("network")
                name("nfs")
                name("nginx")
                name("nook")
                name("nookcloudops")
                name("nookpress")
                name("nookre")
                name("nscd")
                name("ntp")
                name("onix")
                name("openldap")
                name("openssl")
                name("oracle")
                name("oracle_instantclient")
                name("oracle_jdk")
                name("oraclejava")
                name("os")
                name("os_r10k")
                name("ossec")
                name("packageupdate")
                name("pci")
                name("pcsc")
                name("pe")
                name("pe_accounts")
                name("pentaho")
                name("perfeng")
                name("phantom")
                name("php")
                name("php_remi")
                name("port")
                name("portmap")
                name("postfix")
                name("postgres")
                name("profiled")
                name("profiles")
                name("proxy")
                name("psp")
                name("puppet")
                name("puppet_agent")
                name("puppet_hiera")
                name("puppet_manifests")
                name("puppi")
                name("python")
                name("radius")
                name("rasupport")
                name("relengineering")
                name("repo")
                name("resolv")
                name("resourcespace")
                name("riak")
                name("roles")
                name("root")
                name("rrdclient")
                name("rstatd")
                name("rsyslog")
                name("rsyslog_jetty")
                name("rsyslog_nagios")
                name("samba")
                name("sap")
                name("scm")
                name("scripts")
                name("search")
                name("secgrp")
                name("selinux")
                name("sendmail")
                name("shells")
                name("smokeping")
                name("snmp")
                name("sparknotes")
                name("ssh")
                name("sssd")
                name("stdlib")
                name("storage")
                name("string")
                name("subversion")
                name("sudo")
                name("sudoer")
                name("sudoers")
                name("sunjdk")
                name("symantec")
                name("sysstat")
                name("systemd")
                name("testing")
                name("tikweb")
                name("timesten")
                name("timesync")
                name("timezone")
                name("tomcat6")
                name("tomcat7")
                name("tsm")
                name("ulimit")
                name("unixodbc")
                name("user_commands")
                name("users")
                name("uuidd")
                name("vcsrepo")
                name("virtual")
                name("vmware_guest")
                name("vmwaretools")
                name("vnc")
                name("vsftp")
                name("webinst")
                name("wget")
                name("x11")
                name("xen")
                name("xenguest")
                name("xinetd")
                name("xtrabackup")
                name("yaml")
                name("yum")
                name("zlib")
                name("zzz_ssh")
                name("augeasproviders_pam")
                name("augeasproviders_shellvar")
                name("augeasproviders_ssh")
                name("munin")
                name("puppetdbquery")
                name("vmware_puppetfact")
                name("xfs")
        }
        columns {
                status()
                weather()
                name()
                lastSuccess()
                lastFailure()
                lastDuration()
                buildButton()
        }
}

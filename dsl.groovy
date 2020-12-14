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
				github("https://github.com/srimandarbha/osdash.git", "https")
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
			'projectUrl'('https://github.com/srimandarbha/osdash.git')
		}
	}
}

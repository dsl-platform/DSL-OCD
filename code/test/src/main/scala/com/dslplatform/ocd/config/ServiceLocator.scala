package com.dslplatform.ocd
package config

import hr.ngs.patterns.IServiceLocator
import hr.ngs.patterns.DependencyContainer
import org.slf4j.LoggerFactory
import projects.Projects
import com.dslplatform.ocd.config.CacheSettings

object ServiceLocator {
  val locator: IServiceLocator = {
    val logger = LoggerFactory getLogger "DSL-OCD"

    val ts = new TestSettingsLoader(logger)
      .load("DSL-OCD/ocd.config")

    val projects = new Projects(
      projectsConfigurationPath = sys.props("user.home") + "/.config/DSL-OCD/projects-runtime.ini"
    , executionContext = ec
    , duration = scala.concurrent.duration.Duration.Inf
    )

    val threshold = ProjectAgeThreshold(
      if (CacheSettings.CacheProjects) DateTime.yesterday else DateTime.tomorrow
    )
    logger.info("Project cache threshold set to: " + threshold.threshold)

    new DependencyContainer()
      .register[Logger](logger)
      .register[ITestSettings](ts)
      .register[TestDeployer, ITestDeployer]
      .register[TestGenerator, ITestGenerator]
      .register[ApiActions, IApiActions]
      .register[Projects](projects)
      .register[ProjectAgeThreshold](threshold)
      .register[ProjectCache, IProjectCache]
      .register[TestCases]
      .register[EntryPoint]
  }
}

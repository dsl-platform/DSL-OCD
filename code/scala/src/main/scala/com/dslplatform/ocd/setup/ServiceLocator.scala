package com.dslplatform.ocd
package setup

import hr.ngs.patterns.IServiceLocator
import hr.ngs.patterns.DependencyContainer
import org.slf4j.LoggerFactory

object ServiceLocator {
  val locator: IServiceLocator = {
    val logger = LoggerFactory getLogger "DSL-OCD"

    import setup._

    val ts = new TestSettingsLoader(logger)
      .load("DSL-OCD/workspace.config")

    new DependencyContainer()
      .register[Logger](logger)
      .register[ITestSettings](ts)
      .register[TestDeployer, ITestDeployer]
      .register[TestGenerator, ITestGenerator]
      .register[ApiActions, IApiActions]
  }
}
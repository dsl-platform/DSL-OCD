package com.dslplatform.ocd
package config

import hr.ngs.patterns.IServiceLocator
import hr.ngs.patterns.DependencyContainer
import org.slf4j.LoggerFactory
import scala.reflect.runtime.universe

object ServiceLocator {
  val locator: IServiceLocator = {
    val logger = LoggerFactory getLogger "DSL-OCD"

    val ts = new TestSettingsLoader(logger)
      .load("DSL-OCD/ocd.config")

    new DependencyContainer()
      .register[Logger](logger)
      .register[ITestSettings](ts)
      .register[TestDeployer, ITestDeployer]
      .register[EntryPoint]
  }
}

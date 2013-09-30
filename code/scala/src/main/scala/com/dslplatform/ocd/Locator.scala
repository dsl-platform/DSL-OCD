package com.dslplatform.ocd

import hr.ngs.patterns.DependencyContainer
import hr.ngs.patterns.IServiceLocator
import org.slf4j.LoggerFactory

object ServiceLocator {
  val locator: IServiceLocator = {
    val logger = LoggerFactory getLogger "DSL-OCD"
    val tsl = new TestSettingsLoader(logger)
    val tpl = new TestProjectLoader(logger)

    new DependencyContainer()
      .register[Logger](logger)
      .register[ITestSettings](tsl.load("DSL-OCD/project.ini"))
      .register[ITestProject](tpl.load("d:/Code/DSL-OCD/code/java"))
      .register[TestDeployer, ITestDeployer]
  }
}

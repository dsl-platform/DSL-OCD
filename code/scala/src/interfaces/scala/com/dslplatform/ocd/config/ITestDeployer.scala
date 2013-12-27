package com.dslplatform.ocd
package config

trait ITestDeployer {
  def deployTests(projectIni: ProjectIni, tests: Seq[ITestSetup]): Unit
}

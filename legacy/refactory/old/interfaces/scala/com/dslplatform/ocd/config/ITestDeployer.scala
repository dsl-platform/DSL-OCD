package com.dslplatform.ocd
package config

trait ITestDeployer {
  def deployTests(tests: Seq[ITestSetup]): Unit
}

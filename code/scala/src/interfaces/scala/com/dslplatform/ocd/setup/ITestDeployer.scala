package com.dslplatform.ocd
package setup

trait ITestDeployer {
  def deployTests(tests: Seq[ITestSetup]): Unit
}

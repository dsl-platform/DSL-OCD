package com.dslplatform.ocd
package setup

trait ITestGenerator {
  def generateTests(tests: Seq[ITest]): Seq[ITestSetup]
}

package com.dslplatform.ocd
package config

trait ITestGenerator {
  def generateTests(tests: Seq[ITest]): ITestSetup
}

package com.dslplatform.ocd
package config

trait ITestGenerator {
  def generateTests(
      testName: String
    , tests: Seq[ITest]): ITestSetup
}

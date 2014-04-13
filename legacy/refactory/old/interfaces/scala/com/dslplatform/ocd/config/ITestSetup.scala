package com.dslplatform.ocd
package config

trait ITestSetup {
  def testName: String
  def projectIni: ProjectIni
  def tests: Seq[ITest]
  def codeFiles: Map[Language, Files]
}

package com.dslplatform.ocd
package config

import projects.ProjectIni
import com.dslplatform.compiler.client.api.params.Language

trait ITestSetup {
  def testName: String
  def projectIni: ProjectIni
  def tests: Seq[ITest]
  def codeFiles: Map[Language, Files]
}

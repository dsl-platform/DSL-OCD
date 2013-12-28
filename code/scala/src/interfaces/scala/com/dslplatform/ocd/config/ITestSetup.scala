package com.dslplatform.ocd
package config

import com.dslplatform.compiler.client.api.params.Language

trait ITestSetup {
  def projectIni: ProjectIni
  def tests: Seq[ITest]
  def codeFiles: Map[Language, Map[String, String]]
}

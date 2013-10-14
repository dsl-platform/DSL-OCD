package com.dslplatform.ocd
package config

import com.dslplatform.compiler.client.api.params.Language

trait ITestSetup {
  def test: ITest
  def codeFiles: Map[Language, Map[String, String]]
}

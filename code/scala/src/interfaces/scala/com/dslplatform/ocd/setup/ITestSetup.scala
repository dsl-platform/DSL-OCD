package com.dslplatform.ocd
package setup

import com.dslplatform.compiler.client.api.params.Language

trait ITestSetup {
  def test: ITest
  def codeFiles: Map[Language, Map[String, String]]
}

package com.dslplatform.ocd
package config

import com.dslplatform.compiler.client.api.params.Language

trait ITest {
  def packageName: String

  def dslFiles: Files
  def testFiles: Map[Language, Files]
}

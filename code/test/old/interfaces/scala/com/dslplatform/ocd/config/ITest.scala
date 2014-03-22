package com.dslplatform.ocd
package config

/** Everything that is necessarry to deploy a test project:
 *
 *  packageName that the DSL compiler should target
 *  dslFiles for the compilation
 *  testFiles which need to be distributed into appropriate projects
 */
trait ITest {
  def packageName: String
  def dslFiles: Files
  def testFiles: Map[Language, Files]
}

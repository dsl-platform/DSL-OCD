package com.dslplatform.ocd
package test
package TestScala
package property

trait TestScalaPropertyDefaultValueAfterPersist
    extends TestComponentScala
    with types.TestPropertyDefaultValueType {

  val testDesc = "Test property default value after persist"

  val imports = Seq(
  )

  def scalaClass: String
  def fieldName: String
  def fieldClass: String
  def defaultPropertyValue: String

  def testComponentBody = s"""
  def `${testDesc}: ${defaultPropertyValue}`() {
    ${testSwitcher}
  }
"""

  private def testSwitcher =
    defaultPropertyValue match {
      case "java.util.UUID.randomUUID" => runtimeClassTester("java.util.UUID")
      case "org.joda.time.DateTime.now" => runtimeClassTester("org.joda.time.DateTime")
      case _ => equalsTester
    }

  private def runtimeClassTester(clazz: String) =
    s"assert(${scalaClass}().${fieldName}.getClass == classOf[${clazz}]);"

  private def equalsTester =
    s"assert(${scalaClass}().${fieldName} === ${defaultPropertyValue})"
}

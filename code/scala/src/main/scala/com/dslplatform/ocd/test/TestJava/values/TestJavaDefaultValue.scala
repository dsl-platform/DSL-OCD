package com.dslplatform.ocd
package test
package TestJava
package values

trait TestJavaDefaultPropertyValue
    extends TestComponentJava
    with types.TestFieldType {

  val testDesc = "Tests default value"

  val imports = Seq(
    "static org.junit.Assert.*"
  , "java.util.*"
  )

  def javaClass: String
  def fieldName: String
  def fieldClass: String
  def defaultPropertyValue: String

  private def getterName = "get" + fieldName.head.toUpper + fieldName.tail

  def testComponentBody = s"""
    @Test
    public void testDefaultPropertyValue() {
        ${testSwitcher}
    }
"""

  def testSwitcher =
    defaultPropertyValue match {
      case "null" => nullTester
      case "java.util.UUID.randomUUID()" => nonNullTester
      case x if x.last == ']' => arrayTester
      case _ => equalsTester
    }

  def nullTester =
    s"""assertNull(new ${javaClass}().${getterName}());"""

  def nonNullTester =
    s"""assertNotNull(new ${javaClass}().${getterName}());"""

  def arrayTester =
    s"""${jUnitExtender}assertArrayEquals(
                ${defaultPropertyValue},
                new ${javaClass}().${getterName}()${precisionSwitcher});"""

  def equalsTester =
    s"""${jUnitExtender}assertEquals(
                ${defaultPropertyValue},
                new ${javaClass}().${getterName}()${precisionSwitcher});"""

  def jUnitExtender =
    defaultPropertyValue match {
      case "new boolean[0]"
         | "new Double[0]"
         | "new Float[0]"
         | "org.joda.time.DateTime.now()" => "AssertExtensions."

      case _ => ""
    }

  def precisionSwitcher =
    defaultPropertyValue match {
      case "new double[0]"
         | "new Double[0]"
         | "0.0" => """,
                0.0"""

      case "new float[0]"
         | "new Float[0]"
         | "0.0f" => """,
                0.0f"""

      case "org.joda.time.DateTime.now()" => """,
                org.joda.time.Duration.standardSeconds(10)"""

      case _ => ""
    }
}

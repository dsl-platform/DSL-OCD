package com.dslplatform.ocd
package test
package TestJava
package property

trait TestJavaPropertyDefaultValue
    extends TestComponentJava
    with types.TestPropertyDefaultValueType {

  val testDesc = "Test property default value"

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
    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        ${testSwitcher}
    }
"""

  private def testSwitcher =
    defaultPropertyValue match {
      case "null" => nullTester
      case "java.util.UUID.randomUUID()" => runtimeClassTester("java.util.UUID")
      case x if x.last == ']' => arrayTester
      case _ => equalsTester
    }

  private def nullTester =
    s"""assertNull(new ${javaClass}().${getterName}());"""

  private def nonNullTester =
    s"""assertNotNull(new ${javaClass}().${getterName}());"""

  private def runtimeClassTester(clazz: String) =
    s"""assertEquals(
                ${fieldClass}.class, // unstable type, cannot test for equality
                new ${javaClass}().${getterName}().getClass());"""

  private def arrayTester =
    s"""${jUnitExtender}assertArrayEquals(
                ${defaultPropertyValue},
                new ${javaClass}().${getterName}()${precisionSwitcher});"""

  private def equalsTester =
    s"""${jUnitExtender}assertEquals(
                ${defaultPropertyValue},
                new ${javaClass}().${getterName}()${precisionSwitcher});"""

  private def jUnitExtender =
    defaultPropertyValue match {
      case "new boolean[0]"
         | "new Double[0]"
         | "new Float[0]"
         | "org.joda.time.DateTime.now()" => "AssertExtensions."

      case _ => ""
    }

  private def precisionSwitcher =
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

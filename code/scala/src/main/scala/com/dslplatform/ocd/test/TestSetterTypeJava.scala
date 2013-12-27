package com.dslplatform.ocd
package test
package java

trait TestJavaSetterType
    extends TestComponentJava
    with types.TestSetterType {

  val testDesc = "Tests getter type"

  val imports = Seq(
    "com.dslplatform.ocd.test.TypeTester"
  , "static org.junit.Assert.*"
  )

  def javaClass: String
  def fieldName: String
  def fieldClass: String
  def underlying: Option[String]

  private def typeParameters = underlying match {
    case Some(tp) => s", $tp.class"
    case _ => ""
  }

  private def setterName = "set" + fieldName.head.toUpper + fieldName.tail

  def testComponentBody = s"""
    @Test
    public void testSetterType() throws NoSuchMethodException {
        assertTrue(TypeTester.testSetter(${javaClass}.class, "${setterName}", ${fieldClass}.class${typeParameters})
                .resultEquals(${javaClass}.class));
    }
"""
}

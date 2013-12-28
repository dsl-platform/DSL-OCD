package com.dslplatform.ocd
package test
package java

trait TestJavaGetterType
    extends TestComponentJava
    with types.TestGetterType {

  val testDesc = "Tests getter type"

  val imports = Seq(
    "com.dslplatform.ocd.test.TypeTester"
  , "static org.junit.Assert.*"
  , "java.util.*"
  )

  def javaClass: String
  def fieldName: String
  def fieldClass: String
  def underlying: Option[String]

  private def getterName = "get" + fieldName.head.toUpper + fieldName.tail
  private def typeParameters = underlying match {
    case Some(tp) => s", $tp.class"
    case _ => ""
  }

  def testComponentBody = s"""
    @Test
    public void testGetterType() throws NoSuchMethodException {
        assertTrue(TypeTester.testGetter(${javaClass}.class, "${getterName}")
                .resultEquals(${fieldClass}.class${typeParameters}));
    }
"""
}

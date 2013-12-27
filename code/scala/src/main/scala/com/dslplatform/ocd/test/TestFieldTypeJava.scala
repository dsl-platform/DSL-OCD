package com.dslplatform.ocd
package test
package java

trait TestJavaFieldType
    extends TestComponentJava
    with types.TestFieldType {

  val testDesc = "Tests field type"

  val imports = Seq(
    "com.dslplatform.ocd.test.TypeTester"
  , "static org.junit.Assert.*"
  , "java.util.Set"
  )

  def javaClass: String
  def fieldName: String
  def fieldClass: String
  def underlying: Option[String]

  private def typeParameters = underlying match {
    case Some(tp) => s", $tp.class"
    case _ => ""
  }

  def testComponentBody = s"""
    @Test
    public void testFieldType() throws NoSuchFieldException {
        assertTrue(TypeTester.testField(${javaClass}.class, "${fieldName}")
                .resultEquals(${fieldClass}.class${typeParameters}));
    }
"""
}

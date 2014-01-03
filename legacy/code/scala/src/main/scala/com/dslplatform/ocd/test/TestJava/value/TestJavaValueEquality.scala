package com.dslplatform.ocd
package test
package TestJava
package value

trait TestJavaValueEquality
    extends TestComponentJava
    with types.TestValueEqualityType {

  val testDesc = "Test value equality"

  val imports = Seq(
    "static org.junit.Assert.*"
  )

  def javaClass: String

  def testComponentBody =
    s"""
    /* Value objects should be equal when instantiated with default properties */
    @Test
    public void testValueEquality() {
      final ${javaClass} v1 = new ${javaClass}();
      final ${javaClass} v2 = new ${javaClass}();

      // hashCode equality implies object equality, thus hashCode must be equal
      assertEquals(v1.hashCode(), v2.hashCode());
      assertEquals(v1, v2);
    }
"""
}

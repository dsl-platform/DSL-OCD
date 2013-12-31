package com.dslplatform.ocd
package test
package TestJava
package property

trait TestJavaPropertySetterNullGuard
    extends TestComponentJava
    with types.TestPropertySetterNullGuardType {

  val testDesc = "Test setter null guard"

  val imports = Seq(
    "static org.junit.Assert.*"
  )

  def javaClass: String
  def fieldName: String
  def fieldClass: String
  def isNullable: Boolean

  private def setterName = "set" + fieldName.head.toUpper + fieldName.tail

  def testComponentBody =
    if (isNullable) testNullOk else testNullException

  private def testNullOk = s"""
    /* Setting a nullable property to null should not trigger an exception */
    @Test
    public void testLackOfSetterNullGuard() {
        final ${javaClass} value = new ${javaClass}();
        assertSame(value.${setterName}(null), value);
    }
"""

  private def testNullException =
    s"""
    /* Setting a non-nullable property to null should trigger an exception */
    @Test(expected = IllegalArgumentException.class)
    public void testSetterNullGuard() {
        try {
            new ${javaClass}().${setterName}(null);
        }
        catch (final IllegalArgumentException e) {
            assertEquals(
                    "Property \\"${fieldName}\\" cannot be null!",
                    e.getMessage());
            throw e;
        }
    }
"""
}

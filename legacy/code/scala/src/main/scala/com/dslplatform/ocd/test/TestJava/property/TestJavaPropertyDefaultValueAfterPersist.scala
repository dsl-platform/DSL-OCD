package com.dslplatform.ocd
package test
package TestJava
package property

trait TestJavaPropertyDefaultValueAfterPersist
    extends TestComponentJava
    with types.TestPropertyDefaultValueType {

  val testDesc = "Test property default value after persist"

  val imports = Seq(
    "static org.junit.Assert.*"
  , "java.util.*"
  , "java.util.concurrent.ExecutionException"
  )

  def javaClass: String
  def fieldName: String
  def fieldClass: String
  def defaultPropertyValue: String

  private def getterName = "get" + fieldName.head.toUpper + fieldName.tail

  def testComponentBody = s"""
    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws InterruptedException, ExecutionException {
        cleanup();
        final ${javaClass} aggregate = new ${javaClass}();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final ${javaClass} persisted = repository.find(uri).get();

        ${testSwitcher}
    }
"""

  private def testSwitcher =
    defaultPropertyValue match {
      case x if x.last == ']' => arrayTester
      case _ => equalsTester
    }

  private def arrayTester =
    s"""${jUnitExtender}assertArrayEquals(
                aggregate.${getterName}(),
                persisted.${getterName}()${precisionSwitcher});"""

  private def equalsTester =
    s"""${jUnitExtender}assertEquals(
                aggregate.${getterName}(),
                persisted.${getterName}()${precisionSwitcher});"""

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
                org.joda.time.Duration.standardSeconds(0)"""

      case _ => ""
    }
}

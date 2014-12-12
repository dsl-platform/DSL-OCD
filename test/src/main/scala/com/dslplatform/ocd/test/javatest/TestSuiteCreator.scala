package com.dslplatform.ocd
package test.javatest

import com.dslplatform.ocd.test.TestComponent

trait TestSuiteCreator
    extends TestJavaTemplate {

  def testClasses: Seq[String]

  override val imports = Seq(
    "junit.framework.JUnit4TestAdapter"
  , "junit.framework.TestSuite"
  , "org.junit.runner.RunWith"
  , "org.junit.runners.AllTests"
  , "org.junit.runners.BlockJUnit4ClassRunner"
  )

  override val classDecorations = Seq(
    "RunWith(AllTests.class)"
//    "RunWith(OcdJunitTestRunner.class)"
  )

  override def leadingBlocks = Seq("""
    private static final Class<?>[] TEST_CLASSES = """ +
    testClasses.map(testClass =>
      testClass + ".class"
    ).mkString("{\n        ", ",\n        ", "\n    };\n")
  )

  def tests = Seq(new TestComponent{
    def testComponentBody = """
    public static TestSuite suite() {
        final TestSuite suite = new TestSuite();
        for (final Class<?> clazz : TEST_CLASSES) {
            suite.addTest(new JUnit4TestAdapter(clazz));
        }
        return suite;
     }
"""
  })
}

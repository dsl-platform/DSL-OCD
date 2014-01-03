package com.dslplatform.ocd
package impl
package java
package test

import types._

trait TestImplJava
    extends OcdImpl
    with `lang.Java` {

  def javaTemplate: String
}

import scala.collection.mutable.{ Map => MMap }

private object TestImplJavaTemplate {
  private def cleanup(text: String) = text
    .trim
    .replaceAll("\n{3,}", "\n\n")
    .replaceAll("(\\{\n)\n+", "$1")
    .replaceAll("\n+(\n *\\})", "$1")
}

trait TestImplJavaTemplate
    extends TestImplJava {

  def packageName: String
  def imports: String
  def staticFields: String
  def beforeClass: String
  def afterClass: String
  def beforeTest: String
  def afterTest: String

  private var tests = MMap.empty[String, String]

  protected def registerTest(testName: String, testBody: String) = {
    tests(testName) = testBody
  }

  private def formatTests =
    (tests map { case (name, body) =>
      s"""

    // ${name}${body}
"""
    }) mkString "\n"


  def javaTemplate = TestImplJavaTemplate.cleanup(s"""
package ${packageName};

${imports}

import com.dslplatform.client.Bootstrap;
import com.dslplatform.patterns.ServiceLocator;

public class TestArrBool {
    private static ServiceLocator locator;
${staticFields}

    @BeforeClass
    public static void setUpClass() throws Exception {
        locator = Bootstrap.init(Main.class.getResourceAsStream("/project.ini"));
${beforeClass}
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
${afterClass}
        locator.resolve(java.util.concurrent.ExecutorService.class).shutdown();
        locator = null;
    }

    @Before
    public void setUp() throws Exception {
${beforeTest}
    }

    @After
    public void tearDown() throws Exception {
${afterTest}
    }
${formatTests}
}
""")
}

package com.dslplatform.ocd
package test
package java

import types._
import scala.collection.immutable.TreeSet

trait TestJava
    extends types.OcdTest {
  def testBody: String
}

trait TestComponentJava {
  def imports: Seq[String]
  def testComponentBody: String
}

private object TestJavaTemplate {
  private def cleanup(text: String) = text
    .trim
    .replaceAll("(\n\n)\n+", "$1")
    .replaceAll("(\\{\n)\n+", "$1")
    .replaceAll("\n+(\n *\\})", "$1")
}

trait TestJavaTemplate
    extends TestJava {

  def packageName: String
  def testName: String
  def staticFields: String
  def beforeClass: String
  def afterClass: String
  def beforeTest: String
  def afterTest: String

  def testComponents: Seq[TestComponentJava]
  def testComponentsString =
    testComponents.map(_.testComponentBody).mkString

  def imports: Seq[String]
  def importsString = (
      TreeSet(
        "org.junit.*"
      , "com.dslplatform.client.Bootstrap"
      , "com.dslplatform.patterns.ServiceLocator"
      ) ++ imports
      ++ testComponents.flatMap(_.imports)
    ) map("import " + _  + ";") mkString("\n")

  def testBody = TestJavaTemplate.cleanup(s"""
package ${packageName};

${importsString}

public class ${testName} {
    private static ServiceLocator locator;
${staticFields}

    @BeforeClass
    public static void setUpClass() throws Exception {
        locator = Bootstrap.init(${testName}.class.getResourceAsStream("dsl-project.ini"));
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
${testComponentsString}
}
""")
}

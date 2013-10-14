package com.dslplatform.ocd
package test
package java

import types._

trait TestJava {
  def javaTemplate: String
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
  def imports: String
  def staticFields: String
  def beforeClass: String
  def afterClass: String
  def beforeTest: String
  def afterTest: String

  def tests: String

  def javaTemplate = TestJavaTemplate.cleanup(s"""
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
${tests}
}
""")
}

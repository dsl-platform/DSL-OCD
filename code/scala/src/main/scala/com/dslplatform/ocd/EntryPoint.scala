package com.dslplatform.ocd

import config._
import com.dslplatform.compiler.client.api.params.Language
import impl.dsl.setup.SetupOneBoolInValueDsl

import test.java._

object EntryPoint extends App {
  Locator[EntryPoint].simpleTest()
}

class EntryPoint(
    val testGenerator: ITestGenerator,
    val testDeployer: ITestDeployer) {

  def simpleTest() {
    val su = new SetupOneBoolInValueDsl {}

    val valueTest = new ITest { test =>
      def packageName = "com.dslplatform.ocd.values"

      def dslFiles =
        Map((su.ModuleName + ".dsl") -> su.dslTemplate.toString)

      val tjft = new TestJavaFieldType() {
        val packageName = test.packageName
        val testName = "TestJavaFieldTypeOfOneBoolInValue"
        val testDesc = testName

        val afterClass: String = ""
        val afterTest: String = ""
        val beforeClass: String = ""
        val beforeTest: String = ""
        val imports: String = ""
        val staticFields = ""
        val tests = testJavaFieldType

        def javaClass = su.ValueName
        def fieldClass = impl.`java.Boolean`.javaClass
        def fieldName = su.propertyName
      }

      val filePath =
        "java/" +
        tjft.packageName.replace('.', '/') + "/" +
        tjft.testName + ".java"

      def testFiles = Map(
        Language.JAVA -> Map(filePath -> tjft.javaTemplate)
      , Language.SCALA -> Map("a1.scala" -> "// keke")
      )
    }

    val tests = testGenerator.generateTests(valueTest :: Nil)
    testDeployer.deployTests(tests)
  }
}

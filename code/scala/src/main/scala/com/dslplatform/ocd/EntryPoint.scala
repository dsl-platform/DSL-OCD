package com.dslplatform.ocd

import config._
import com.dslplatform.compiler.client.api.params.Language
import impl.dsl.setup.SetupOneBoolInValueDsl
import impl.dsl.setup.SetupOptBoolInValueDsl
import test.java._
import com.dslplatform.ocd.impl.dsl.setup.SetupOptSetOptBoolInValueDsl

object EntryPoint extends App {
  Locator[EntryPoint].simpleTest()
}

class EntryPoint(
    val testGenerator: ITestGenerator,
    val testDeployer: ITestDeployer) {

  def simpleTest() {

    val valueTest1 = new ITest { test =>
      val sone = new SetupOneBoolInValueDsl {}

      def packageName = "com.dslplatform.ocd.values"

      def dslFiles =
        Map((sone.ModuleName + ".dsl") -> sone.dslTemplate.toString)

      val tjft = new TestJavaTemplate() {
        val packageName = test.packageName
        val testName = "TestOneBoolInValue"
        val testDesc = testName

        val imports = Seq(
          packageName + "." + sone.ModuleName + "." + sone.ValueName
        )

        val afterClass: String = ""
        val afterTest: String = ""
        val beforeClass: String = ""
        val beforeTest: String = ""
        val staticFields = ""

        val testComponents = Seq(
          new TestJavaFieldType {
            def javaClass = sone.ValueName
            def fieldClass = impl.`java.Boolean`.javaClass
            def fieldName = sone.property.name
            def underlying = impl.`java.Boolean`.underlying
          }
        , new TestJavaGetterType {
            def javaClass = sone.ValueName
            def fieldClass = impl.`java.Boolean`.javaClass
            def fieldName = sone.property.name
            def underlying = impl.`java.Boolean`.underlying
          }
        , new TestJavaSetterType {
            def javaClass = sone.ValueName
            def fieldClass = impl.`java.Boolean`.javaClass
            def fieldName = sone.property.name
            def underlying = impl.`java.Boolean`.underlying
          }
        )
      }

      val filePath =
        "java/" +
        tjft.packageName.replace('.', '/') + "/" +
        tjft.testName + ".java"

      def testFiles = Map(
        Language.JAVA -> Map(filePath -> tjft.testBody)
      )
    }

    val valueTest2 = new ITest { test =>
      val sopt = new SetupOptBoolInValueDsl {}

      def packageName = "com.dslplatform.ocd.values"

      def dslFiles =
        Map((sopt.ModuleName + ".dsl") -> sopt.dslTemplate.toString)

      val tjft = new TestJavaTemplate() {
        val packageName = test.packageName
        val testName = "TestOptBoolInValue"
        val testDesc = testName

        val imports = Seq(
          packageName + "." + sopt.ModuleName + "." + sopt.ValueName
        )

        val afterClass: String = ""
        val afterTest: String = ""
        val beforeClass: String = ""
        val beforeTest: String = ""
        val staticFields = ""

        val testComponents = Seq(
          new TestJavaFieldType {
            def javaClass = sopt.ValueName
            def fieldClass = impl.`java.Boolean?`.javaClass
            def fieldName = sopt.property.name
            def underlying = impl.`java.Boolean?`.underlying
          }
        , new TestJavaGetterType {
            def javaClass = sopt.ValueName
            def fieldClass = impl.`java.Boolean?`.javaClass
            def fieldName = sopt.property.name
            def underlying = impl.`java.Boolean?`.underlying
          }
        , new TestJavaSetterType {
            def javaClass = sopt.ValueName
            def fieldClass = impl.`java.Boolean?`.javaClass
            def fieldName = sopt.property.name
            def underlying = impl.`java.Boolean?`.underlying
          }
        )
      }

      val filePath =
        "java/" +
        tjft.packageName.replace('.', '/') + "/" +
        tjft.testName + ".java"

      def testFiles = Map(
        Language.JAVA -> Map(filePath -> tjft.testBody)
      )
    }

    val valueTest3 = new ITest { test =>
      val sopt = new SetupOptSetOptBoolInValueDsl {}

      def packageName = "com.dslplatform.ocd.values"

      def dslFiles =
        Map((sopt.ModuleName + ".dsl") -> sopt.dslTemplate.toString)

      val tjft = new TestJavaTemplate() {
        val packageName = test.packageName
        val testName = "TestOptSetOptBoolInValue"
        val testDesc = testName

        val imports = Seq(
          packageName + "." + sopt.ModuleName + "." + sopt.ValueName
        )

        val afterClass: String = ""
        val afterTest: String = ""
        val beforeClass: String = ""
        val beforeTest: String = ""
        val staticFields = ""

        val testComponents = Seq(
          new TestJavaFieldType {
            def javaClass = sopt.ValueName
            def fieldClass = impl.`java.Set<Boolean?>?`.javaClass
            def fieldName = sopt.property.name
            def underlying = impl.`java.Set<Boolean?>?`.underlying
          }
        , new TestJavaGetterType {
            def javaClass = sopt.ValueName
            def fieldClass = impl.`java.Set<Boolean?>?`.javaClass
            def fieldName = sopt.property.name
            def underlying = impl.`java.Set<Boolean?>?`.underlying
          }
        , new TestJavaSetterType {
            def javaClass = sopt.ValueName
            def fieldClass = impl.`java.Set<Boolean?>?`.javaClass
            def fieldName = sopt.property.name
            def underlying = impl.`java.Set<Boolean?>?`.underlying
          }
        )
      }

      val filePath =
        "java/" +
        tjft.packageName.replace('.', '/') + "/" +
        tjft.testName + ".java"

      def testFiles = Map(
        Language.JAVA -> Map(filePath -> tjft.testBody)
      )
    }

    val tests = testGenerator.generateTests(valueTest1 :: valueTest2 :: valueTest3 :: Nil)
    testDeployer.deployTests(tests._1, tests._2)
  }
}

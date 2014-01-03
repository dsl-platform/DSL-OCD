package com.dslplatform.ocd
package value

import config._
import impl.dsl.setup._

import test.TestJava._
import test.TestJava.property._
import test.TestJava.value._

import test.TestScala._
import test.TestScala.property._
// import test.TestScala.value._

import com.dslplatform.compiler.client.api.params.Language

private object ValueZeroPropertiesTests {
  val setup = new SetupZeroPropertiesInValueDsl {}
}

trait ValueZeroPropertiesTests {
  import ValueZeroPropertiesTests._

  def valueZeroPropertiesTests = Seq(
    new ITest { test =>
      def packageName = "com.dslplatform.ocd.values"

      def dslFiles =
        Map(("values/zero/" + setup.ModuleName + ".dsl", setup.dslTemplate + "\n"))

      private val javaTemplate = new TestJavaTemplate {
        val packageName = test.packageName

        val testName = "Test" + setup.ValueName
        val testDesc = testName

        val imports = Seq(
          packageName + "." + setup.ModuleName + "." + setup.ValueName
        )

				val staticFields = ""
				val beforeClass = ""
				val afterClass = ""
				val beforeTest = ""
				val afterTest = ""
				val helperMethods = ""

        val testComponents = Seq(
          new TestJavaValueEquality {
            def javaClass = setup.ValueName
          }
        , new TestJavaHashCodeStability {
            def moduleName = setup.ModuleName
            def javaClass = setup.ValueName
          }
        )
      }

      private val scalaTemplate = new TestScalaTemplate {
        val packageName = test.packageName

        val testName = "Test" + setup.ValueName
        val testDesc = testName

        val imports = Seq(
          setup.ModuleName + "." + setup.ValueName
        )

        val testComponents = Seq(
        )
      }

      private val javaFilePath =
        "java/" +
        javaTemplate.packageName.replace('.', '/') + "/" +
        javaTemplate.testName + ".java"

      private val scalaFilePath =
        "scala/" +
        scalaTemplate.packageName.replace('.', '/') + "/" +
        scalaTemplate.testName + ".scala"

      def testFiles = Map(
        Language.JAVA -> Map(
          javaFilePath -> javaTemplate.testBody
        )
      , Language.SCALA -> Map(
          scalaFilePath -> scalaTemplate.testBody
        )
      )
    }
  )
}

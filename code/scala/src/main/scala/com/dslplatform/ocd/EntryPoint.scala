package com.dslplatform.ocd

import com.dslplatform.compiler.client.api.params.Language
import config._
import types._
import test.TestJava._
import test.TestJava.values._
import test.TestScala._
import test.TestScala.values._
import impl.dsl.setup.SetupSinglePropertyInValueDsl

object EntryPoint extends App {
  Locator[EntryPoint].simpleTest()
}

class EntryPoint(
    val testGenerator: ITestGenerator,
    val testDeployer: ITestDeployer) {

  def simpleTest() {

    val boxes = Seq(
      `box.One`
    , `box.Opt`
    , `box.Array`
    , `box.List`
    , `box.Set`
    , `box.OptArray`
    , `box.OptList`
    , `box.OptSet`
    , `box.ArrayOpt`
    , `box.ListOpt`
    , `box.SetOpt`
    , `box.OptArrayOpt`
    , `box.OptListOpt`
    , `box.OptSetOpt`
    )

    val types = Seq(
      `tipe.Binary`
    , `tipe.Bool`
    , `tipe.Date`
    , `tipe.Decimal`
    , `tipe.Double`
    , `tipe.Float`
    , `tipe.Guid`
    , `tipe.Integer`
    , `tipe.KeyValue`
    , `tipe.Long`
    , `tipe.Money`
    , `tipe.String`
    , `tipe.Timestamp`
    , `tipe.Xml`
    )

    val setups = for {
      box <- boxes
      tipe <- types
    } yield {
      new SetupSinglePropertyInValueDsl {
        val propertyType = impl.DslTypeResolver.resolve(tipe, box)
      }
    }

    val valueTests = setups map { setup =>
      new ITest { test =>
        def packageName = "com.dslplatform.ocd.values"

        def dslFiles =
          Map((setup.ModuleName + ".dsl", setup.dslTemplate + "\n"))

        val javaTemplate = new TestJavaTemplate() {
          val packageName = test.packageName

          val testName = "Test" + setup.ValueName
          val testDesc = testName

          val imports = Seq(
            packageName + "." + setup.ModuleName + "." + setup.ValueName
          )

          val afterClass: String = ""
          val afterTest: String = ""
          val beforeClass: String = ""
          val beforeTest: String = ""
          val staticFields = ""

          val javaType = impl.JavaTypes.resolve(setup.propertyType)

          val testComponents = Seq(
            new TestJavaFieldType {
              def javaClass = setup.ValueName
              def fieldClass = javaType.javaClass
              def fieldName = setup.property.name
            }
          , new TestJavaGetterType {
              def javaClass = setup.ValueName
              def fieldClass = javaType.javaClass
              def fieldName = setup.property.name
            }
          , new TestJavaSetterType {
              def javaClass = setup.ValueName
              def fieldClass = javaType.javaClass
              def fieldName = setup.property.name
            }
          , new TestJavaDefaultPropertyValue {
              def javaClass = setup.ValueName
              def fieldClass = javaType.javaClass
              def fieldName = setup.property.name
              def defaultPropertyValue = javaType.defaultValue
            }
          )
        }

        val scalaTemplate = new TestScalaTemplate() {
          val packageName = test.packageName

          val testName = "Test" + setup.ValueName
          val testDesc = testName

          val imports = Seq(
            setup.ModuleName + "." + setup.ValueName
          )

          val afterClass: String = ""
          val afterTest: String = ""
          val beforeClass: String = ""
          val beforeTest: String = ""
          val staticFields = ""

          val scalaType = impl.ScalaTypes.resolve(setup.propertyType)

          val testComponents = Seq(
            new TestScalaFieldType {
              def scalaClass = setup.ValueName
              def fieldClass = scalaType.scalaClass
              def fieldName = setup.property.name
            }
//          , new TestScalaDefaultPropertyValue {
//              def javaClass = setup.ValueName
//              def fieldClass = javaType.javaClass
//              def fieldName = setup.property.name
//              def defaultPropertyValue = javaType.defaultValue
//            }
          )
        }

        val javaFilePath =
          "java/" +
          javaTemplate.packageName.replace('.', '/') + "/" +
          javaTemplate.testName + ".java"

        val scalaFilePath =
          "scala/" +
          scalaTemplate.packageName.replace('.', '/') + "/" +
          scalaTemplate.testName + ".scala"

        def testFiles = Map(
          Language.JAVA -> Map(
            javaFilePath -> javaTemplate.testBody
          , "java/org/junit/AssertExtensions.java" -> TestJavaAssertExtensions.body
          )
        , Language.SCALA -> Map(
            scalaFilePath -> scalaTemplate.testBody
          , "scala/org/scalatest/SpecExtensions.scala" -> TestScalaSpecExtensions.body
          )
        )
      }
    }

    val tests = testGenerator.generateTests(valueTests)
    testDeployer.deployTests(Seq(tests))
  }
}

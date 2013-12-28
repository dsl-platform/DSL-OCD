package com.dslplatform.ocd

import config._
import com.dslplatform.compiler.client.api.params.Language
import test.java._
import types._
import com.dslplatform.ocd.impl.dsl.setup.SetupSinglePropertyInValueDsl

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
    , `box.OptSetOpt`
    )

    val types = Seq(
      `tipe.Bool`
    )

    val setups = for {
      box <- boxes
      tipe <- types
    } yield {
      new SetupSinglePropertyInValueDsl {
        val propertyType = impl.box.DslTypeResolver.resolve(tipe, box)
      }
    }

    val valueTests = setups map { setup =>
      new ITest { test =>
        def packageName = "com.dslplatform.ocd.values"

        def dslFiles =
          Map((setup.ModuleName + ".dsl", setup.dslTemplate.toString))

        val template = new TestJavaTemplate() {
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

          val testComponents = Seq(
            new TestJavaFieldType {
              def javaClass = setup.ValueName
              def fieldClass = impl.JavaTypes.resolve(setup.propertyType).javaClass
              def fieldName = setup.property.name
              def underlying = impl.JavaTypes.resolve(setup.propertyType).underlying
            }
          , new TestJavaGetterType {
              def javaClass = setup.ValueName
              def fieldClass = impl.JavaTypes.resolve(setup.propertyType).javaClass
              def fieldName = setup.property.name
              def underlying = impl.JavaTypes.resolve(setup.propertyType).underlying
            }
          , new TestJavaSetterType {
              def javaClass = setup.ValueName
              def fieldClass = impl.JavaTypes.resolve(setup.propertyType).javaClass
              def fieldName = setup.property.name
              def underlying = impl.JavaTypes.resolve(setup.propertyType).underlying
            }
          )
        }

        val filePath =
          "java/" +
          template.packageName.replace('.', '/') + "/" +
          template.testName + ".java"

        def testFiles = Map(
          Language.JAVA -> Map(filePath -> template.testBody)
        )
      }
    }

    val tests = testGenerator.generateTests(valueTests)
    testDeployer.deployTests(Seq(tests))
  }
}

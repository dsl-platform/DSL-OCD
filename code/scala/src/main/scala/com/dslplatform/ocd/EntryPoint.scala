package com.dslplatform.ocd

import config._
import com.dslplatform.compiler.client.api.params.Language
import impl.dsl.setup.SetupOneBoolInValueDsl
import impl.dsl.setup.SetupOptBoolInValueDsl
import impl.dsl.setup.SetupOptSetOptBoolInValueDsl
import test.java._

object EntryPoint extends App {
  Locator[EntryPoint].simpleTest()
}

class EntryPoint(
    val testGenerator: ITestGenerator,
    val testDeployer: ITestDeployer) {

  def simpleTest() {

    import types._

    val setup = new SetupOptSetOptBoolInValueDsl {}
    val tipe = setup.propertyType

    println(tipe.getClass)
//    tipe.getClass.getInterfaces.foreach(println)

//    JavaTypeResolver.locate[
//      _root_.com.dslplatform.ocd.types.`tipe.Bool`
//    ]

//
//
//    val valueTests = Seq(
//      new SetupOneBoolInValueDsl {}
//    , new SetupOptBoolInValueDsl {}
//    , new SetupOptSetOptBoolInValueDsl {}
//    ) map { setup =>
//      new ITest { test =>
//        def packageName = "com.dslplatform.ocd.values"
//
//        def dslFiles =
//          Map((setup.ModuleName + ".dsl", setup.dslTemplate.toString))
//
//        val template = new TestJavaTemplate() {
//          val packageName = test.packageName
//          val testName = "Test" + System.currentTimeMillis()
//          val testDesc = testName
//
//          val imports = Seq(
//            packageName + "." + setup.ModuleName + "." + setup.ValueName
//          )
//
//          val afterClass: String = ""
//          val afterTest: String = ""
//          val beforeClass: String = ""
//          val beforeTest: String = ""
//          val staticFields = ""
//
//          val testComponents = Seq(
//            new TestJavaFieldType {
//              def javaClass = setup.ValueName
//              def fieldClass = impl.`java.Boolean`.javaClass
//              def fieldName = setup.property.name
//              def underlying = impl.`java.Boolean`.underlying
//            }
//          , new TestJavaGetterType {
//              def javaClass = setup.ValueName
//              def fieldClass = impl.`java.Boolean`.javaClass
//              def fieldName = setup.property.name
//              def underlying = impl.`java.Boolean`.underlying
//            }
//          , new TestJavaSetterType {
//              def javaClass = setup.ValueName
//              def fieldClass = impl.`java.Boolean`.javaClass
//              def fieldName = setup.property.name
//              def underlying = impl.`java.Boolean`.underlying
//            }
//          )
//        }
//
//        val filePath =
//          "java/" +
//          template.packageName.replace('.', '/') + "/" +
//          template.testName + ".java"
//
//        def testFiles = Map(
//          Language.JAVA -> Map(filePath -> template.testBody)
//        )
//      }
//    }
//
//    val tests = testGenerator.generateTests(valueTests)
//    testDeployer.deployTests(Seq(tests))
  }
}

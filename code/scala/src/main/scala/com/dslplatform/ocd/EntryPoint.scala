package com.dslplatform.ocd

import config._
import com.dslplatform.compiler.client.api.params.Language
import impl.dsl.setup.SetupOptSetOptBoolInValueDsl

object EntryPoint extends App {

  val su = new SetupOptSetOptBoolInValueDsl {}

  val valueTests = new ITest {
    def packageName = "com.dslplatform.ocd.values"

    def dslFiles =
      Map((su.ModuleName + ".dsl") -> su.dslTemplate.toString)

    def testFiles = Map(
      Language.JAVA -> Map("a1.java" -> "// keke")
    )
  }



  println(valueTests)


  sys.exit(0)

  val packageNamePrefix = "com.dslplatform.ocd.stub"

  val t1 = new ITest {
    def packageName = "au"

    def dslFiles = Map("t1.dsl" -> "module k1 { root a { String boo; } }")
    def testFiles = Map(
      Language.JAVA -> Map("a1.java" -> "JavaTest"),
      Language.PHP -> Map("a1.java" -> "JavaTest")
    )
  }

  val t2 = new ITest {
    def packageName = "au2"

    def dslFiles = Map("t2.dsl" -> "module k1 { root a { int boo; } }")
    def testFiles = Map(Language.JAVA -> Map("a2.java" -> "JavaTest"),
        Language.SCALA -> Map("a2.java" -> "JavaTest"))
  }

//  val ts = Locator[ITestGenerator].generateTests(t1 :: t2 :: Nil)

// Locator[ITestDeployer].deployTests(ts)



//  .deploy(
//    new TestOneBoolInValueJava { def packageStub = packageNamePrefix }
//  , new TestOptSetOptBoolInValueJava { def packageStub = packageNamePrefix }
}

package com.dslplatform.ocd
import scala.language.dynamics

import setup._
import com.dslplatform.compiler.client.api.params.Language

object EntryPoint extends App {


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


  import impl._

  object Katan {
  val k = Seq(

    module a,
    module b (),
    module c (
      root DecimalSetRoot
    ),

    module c (
      big.root DecimalSetRoot ()
    ),

    module c (
      guid.root DecimalSetRoot(
        `Bool` o
      , `Decimal` d
      ),

      value k (
        "aouea" -> "aouo"
      )
    ),

    module DslTesting (
      root DecimalSetRoot (
        `Set<Decimal>`   oneSet
      , `Set<Decimal>`   oneSet (
          Indexed
        , Unique
        )
      , `List<Int?>?`   oneSet2
      , `List<Int?>`   oneSet23
      , `Set<Decimal>`   oneSet
      , `Bool` oneBool
      , `Bool?` oneBool
      )
    )


  )
}



  Katan.k foreach println


//  .deploy(
//    new TestOneBoolInValueJava { def packageStub = packageNamePrefix }
//  , new TestOptSetOptBoolInValueJava { def packageStub = packageNamePrefix }
}

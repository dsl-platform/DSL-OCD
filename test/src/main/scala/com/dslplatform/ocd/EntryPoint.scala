package com.dslplatform.ocd

import config.ITestDeployer
import test.javatest.property.turtle._
import com.dslplatform.ocd.test.javatest.Visibility
import com.dslplatform.ocd.test.javatest.Modifier
import com.dslplatform.ocd.javas.OcdJavaBoxKind

//import test.aggregates._
import test.values._

object EntryPoint extends App {
  Locator[EntryPoint].run()
}

class EntryPoint(
    logger: Logger
  , testDeployer: ITestDeployer) {

  def run(): Unit = {
    val turtles = Seq(
//      TestJavaAssertsBorderValuesTurtle
//    , TestJavaPropertyFieldTypeTurtle
//    , TestJavaPropertyGetterTypeTurtle
//    , TestJavaPropertySetterTypeTurtle
    )

    import test.javatest.property._

///*
// *    value Dinamo {
// *      Binary k;
// *    }
// *
// *    value Pero {
// *      Boolean[] ke;
// *
// *      Dinamo? d;
// *    }
// *
// *
// */
//
//import kinds._
//import boxes._
//
//import javas._
//
//    val pero = OcdJavaDom(
//      OcdJavaBoxTypeProperty("ke", `java.Boolean[]`)
//    , OcdJavaProperty("d", `box.Nullable`, JavaGenericType("java.util.Deque", JavaClass("foo.Dinamo"), JavaClass("ue")),
//        OcdJavaDom(
//          OcdJavaBoxTypeProperty("k", `java.Binary`)
//        )
//      )
//    )
//
//    val a=
//    new TestJavaPropertyFieldType {
//      def conceptName = "Pero"
//      def property = pero.properties.tail.head
//      def visibility = Visibility.Public
//      def modifiers = Set.empty[Modifier]
//    }
//
//    println(a.testComponentBody)

    val projects =
      ValueWithOnePropertyTestProject.projects ++
      //NestedValuesWithOnePropertyTestProject.projects ++
//      AggregateWithOnePropertyTestProject.projects ++
//      AggregateWithSurrogateKeyAndOnePropertyTestProject.projects ++
//      ValueWithOnePropertyInAggregateWithSurrogateKeyTestProject.projects ++
      Nil

    testDeployer.deployTests(turtles ++ projects)
  }
}

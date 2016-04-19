package com.dslplatform.ocd

import config.ITestDeployer
import test.javatest.property.turtle._
import test.domain._

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
    val projects =
      AggregateWithOnePropertyTestProject.projects ++
      AggregateWithSurrogateKeyAndOnePropertyTestProject.projects ++
      AggregateWithSurrogateKeyAndOnePropertyWithinOneEntityTestProject.projects ++
      AggregateWithSurrogateKeyAndOnePropertyWithinOneValueTestProject.projects ++
      AggregateWithSurrogateKeyAndOnePropertyWithinOneEntityWithinOneEntityTestProject.projects ++
      AggregateWithSurrogateKeyAndOnePropertyWithinOneValueWithinOneEntityTestProject.projects ++
      AggregateWithSurrogateKeyAndOnePropertyWithinOneValueWithinOneValueTestProject.projects ++
      CalculatedPropertyInSnowflakeTestProject.projects ++
      ValueWithOnePropertyTestProject.projects ++
      Nil

    testDeployer.deployTests(
      turtles ++
      projects
    )
  }
}

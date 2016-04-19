package com.dslplatform.ocd

import config._
import test.javatest.property.turtle._
import test.domain._

object EntryPoint extends App {
  Locator[EntryPoint].run()
}

class EntryPoint(
    logger: Logger
  , testSettings: ITestSettings
  , testDeployer: ITestDeployer) {

  def run(): Unit = {
    val turtles = Seq(
//      TestJavaAssertsBorderValuesTurtle
//    , TestJavaPropertyFieldTypeTurtle
//    , TestJavaPropertyGetterTypeTurtle
//    , TestJavaPropertySetterTypeTurtle
    )

    val projects = Seq(
      new AggregateWithOnePropertyTestProjectFactory(testSettings)
    , new AggregateWithSurrogateKeyAndOnePropertyTestProjectFactory(testSettings)
    , new AggregateWithSurrogateKeyAndOnePropertyWithinOneEntityTestProjectFactory(testSettings)
    , new AggregateWithSurrogateKeyAndOnePropertyWithinOneValueTestProjectFactory(testSettings)
    , new AggregateWithSurrogateKeyAndOnePropertyWithinOneEntityWithinOneEntityTestProjectFactory(testSettings)
    , new AggregateWithSurrogateKeyAndOnePropertyWithinOneValueWithinOneEntityTestProjectFactory(testSettings)
    , new AggregateWithSurrogateKeyAndOnePropertyWithinOneValueWithinOneValueTestProjectFactory(testSettings)
    , new CalculatedPropertyInSnowflakeTestProjectFactory(testSettings)
    , new ValueWithOnePropertyTestProjectFactory(testSettings)
    )

    testDeployer.deployTests(
      turtles ++
      projects.flatMap(_.projects)
    )
  }
}

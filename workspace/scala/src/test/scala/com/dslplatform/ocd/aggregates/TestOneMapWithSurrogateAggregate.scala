package com.dslplatform.ocd.aggregates

import OneMapWithSurrogateInAggregate.OneMapWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneMapWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Map[String, String]`() =
    checkType(
      typeOf[Map[String, String]]
    , typeOf[OneMapWithSurrogateAggregate].member("oneMap": TermName).asMethod.returnType
    )

  def `Test property default value: Map.empty[String, String]`() {
    assert(OneMapWithSurrogateAggregate().oneMap === Map.empty[String, String])
  }
}

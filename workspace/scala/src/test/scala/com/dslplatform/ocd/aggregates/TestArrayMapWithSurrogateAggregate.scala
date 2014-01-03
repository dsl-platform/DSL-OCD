package com.dslplatform.ocd.aggregates

import ArrayMapWithSurrogateInAggregate.ArrayMapWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayMapWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Array[Map[String, String]]`() =
    checkType(
      typeOf[Array[Map[String, String]]]
    , typeOf[ArrayMapWithSurrogateAggregate].member("arrayMap": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Map[String, String]]`() {
    assert(ArrayMapWithSurrogateAggregate().arrayMap === Array.empty[Map[String, String]])
  }
}

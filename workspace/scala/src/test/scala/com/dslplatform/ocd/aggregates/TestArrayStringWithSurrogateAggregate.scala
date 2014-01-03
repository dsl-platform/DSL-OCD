package com.dslplatform.ocd.aggregates

import ArrayStringWithSurrogateInAggregate.ArrayStringWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayStringWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Array[String]`() =
    checkType(
      typeOf[Array[String]]
    , typeOf[ArrayStringWithSurrogateAggregate].member("arrayString": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[String]`() {
    assert(ArrayStringWithSurrogateAggregate().arrayString === Array.empty[String])
  }
}

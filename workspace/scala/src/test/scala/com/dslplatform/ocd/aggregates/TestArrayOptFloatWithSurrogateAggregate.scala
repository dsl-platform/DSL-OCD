package com.dslplatform.ocd.aggregates

import ArrayOptFloatWithSurrogateInAggregate.ArrayOptFloatWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptFloatWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Array[Option[Float]]`() =
    checkType(
      typeOf[Array[Option[Float]]]
    , typeOf[ArrayOptFloatWithSurrogateAggregate].member("arrayOptFloat": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Option[Float]]`() {
    assert(ArrayOptFloatWithSurrogateAggregate().arrayOptFloat === Array.empty[Option[Float]])
  }
}

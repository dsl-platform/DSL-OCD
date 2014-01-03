package com.dslplatform.ocd.aggregates

import ArrayFloatWithSurrogateInAggregate.ArrayFloatWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayFloatWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Array[Float]`() =
    checkType(
      typeOf[Array[Float]]
    , typeOf[ArrayFloatWithSurrogateAggregate].member("arrayFloat": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Float]`() {
    assert(ArrayFloatWithSurrogateAggregate().arrayFloat === Array.empty[Float])
  }
}

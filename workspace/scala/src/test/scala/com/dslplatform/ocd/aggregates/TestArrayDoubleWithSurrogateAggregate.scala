package com.dslplatform.ocd.aggregates

import ArrayDoubleWithSurrogateInAggregate.ArrayDoubleWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayDoubleWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Array[Double]`() =
    checkType(
      typeOf[Array[Double]]
    , typeOf[ArrayDoubleWithSurrogateAggregate].member("arrayDouble": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Double]`() {
    assert(ArrayDoubleWithSurrogateAggregate().arrayDouble === Array.empty[Double])
  }
}

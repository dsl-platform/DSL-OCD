package com.dslplatform.ocd.aggregates

import ArrayDoubleInAggregate.ArrayDoubleAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayDoubleAggregate extends SpecExtensions {
  def `Test property field type: Array[Double]`() =
    checkType(
      typeOf[Array[Double]]
    , typeOf[ArrayDoubleAggregate].member("arrayDouble": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Double]`() {
    assert(ArrayDoubleAggregate().arrayDouble === Array.empty[Double])
  }
}

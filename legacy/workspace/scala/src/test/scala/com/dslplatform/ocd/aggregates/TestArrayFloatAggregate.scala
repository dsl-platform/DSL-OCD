package com.dslplatform.ocd.aggregates

import ArrayFloatInAggregate.ArrayFloatAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayFloatAggregate extends SpecExtensions {
  def `Test property field type: Array[Float]`() =
    checkType(
      typeOf[Array[Float]]
    , typeOf[ArrayFloatAggregate].member("arrayFloat": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Float]`() {
    assert(ArrayFloatAggregate().arrayFloat === Array.empty[Float])
  }
}

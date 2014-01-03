package com.dslplatform.ocd.aggregates

import OneFloatInAggregate.OneFloatAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneFloatAggregate extends SpecExtensions {
  def `Test property field type: Float`() =
    checkType(
      typeOf[Float]
    , typeOf[OneFloatAggregate].member("oneFloat": TermName).asMethod.returnType
    )

  def `Test property default value: 0.0f`() {
    assert(OneFloatAggregate().oneFloat === 0.0f)
  }
}

package com.dslplatform.ocd.aggregates

import OneFloatWithSurrogateInAggregate.OneFloatWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneFloatWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Float`() =
    checkType(
      typeOf[Float]
    , typeOf[OneFloatWithSurrogateAggregate].member("oneFloat": TermName).asMethod.returnType
    )

  def `Test property default value: 0.0f`() {
    assert(OneFloatWithSurrogateAggregate().oneFloat === 0.0f)
  }
}

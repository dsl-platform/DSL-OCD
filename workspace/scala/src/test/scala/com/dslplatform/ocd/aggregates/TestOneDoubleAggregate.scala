package com.dslplatform.ocd.aggregates

import OneDoubleInAggregate.OneDoubleAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneDoubleAggregate extends SpecExtensions {
  def `Test property field type: Double`() =
    checkType(
      typeOf[Double]
    , typeOf[OneDoubleAggregate].member("oneDouble": TermName).asMethod.returnType
    )

  def `Test property default value: 0.0`() {
    assert(OneDoubleAggregate().oneDouble === 0.0)
  }
}

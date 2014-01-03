package com.dslplatform.ocd.aggregates

import OneDoubleWithSurrogateInAggregate.OneDoubleWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneDoubleWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Double`() =
    checkType(
      typeOf[Double]
    , typeOf[OneDoubleWithSurrogateAggregate].member("oneDouble": TermName).asMethod.returnType
    )

  def `Test property default value: 0.0`() {
    assert(OneDoubleWithSurrogateAggregate().oneDouble === 0.0)
  }
}

package com.dslplatform.ocd.aggregates

import OneBoolWithSurrogateInAggregate.OneBoolWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneBoolWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Boolean`() =
    checkType(
      typeOf[Boolean]
    , typeOf[OneBoolWithSurrogateAggregate].member("oneBool": TermName).asMethod.returnType
    )

  def `Test property default value: false`() {
    assert(OneBoolWithSurrogateAggregate().oneBool === false)
  }
}

package com.dslplatform.ocd.aggregates

import OneBoolInAggregate.OneBoolAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneBoolAggregate extends SpecExtensions {
  def `Test property field type: Boolean`() =
    checkType(
      typeOf[Boolean]
    , typeOf[OneBoolAggregate].member("oneBool": TermName).asMethod.returnType
    )

  def `Test property default value: false`() {
    assert(OneBoolAggregate().oneBool === false)
  }
}

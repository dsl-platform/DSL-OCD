package com.dslplatform.ocd.aggregates

import OneLongInAggregate.OneLongAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneLongAggregate extends SpecExtensions {
  def `Test property field type: Long`() =
    checkType(
      typeOf[Long]
    , typeOf[OneLongAggregate].member("oneLong": TermName).asMethod.returnType
    )

  def `Test property default value: 0L`() {
    assert(OneLongAggregate().oneLong === 0L)
  }
}

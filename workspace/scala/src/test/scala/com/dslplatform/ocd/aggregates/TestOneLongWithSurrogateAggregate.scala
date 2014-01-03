package com.dslplatform.ocd.aggregates

import OneLongWithSurrogateInAggregate.OneLongWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneLongWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Long`() =
    checkType(
      typeOf[Long]
    , typeOf[OneLongWithSurrogateAggregate].member("oneLong": TermName).asMethod.returnType
    )

  def `Test property default value: 0L`() {
    assert(OneLongWithSurrogateAggregate().oneLong === 0L)
  }
}

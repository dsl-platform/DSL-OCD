package com.dslplatform.ocd.aggregates

import OptBoolWithSurrogateInAggregate.OptBoolWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptBoolWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Boolean]`() =
    checkType(
      typeOf[Option[Boolean]]
    , typeOf[OptBoolWithSurrogateAggregate].member("optBool": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptBoolWithSurrogateAggregate().optBool === None)
  }
}

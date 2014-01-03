package com.dslplatform.ocd.aggregates

import OptSetBoolWithSurrogateInAggregate.OptSetBoolWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetBoolWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Set[Boolean]]`() =
    checkType(
      typeOf[Option[Set[Boolean]]]
    , typeOf[OptSetBoolWithSurrogateAggregate].member("optSetBool": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetBoolWithSurrogateAggregate().optSetBool === None)
  }
}

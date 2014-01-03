package com.dslplatform.ocd.aggregates

import OptSetOptBoolWithSurrogateInAggregate.OptSetOptBoolWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetOptBoolWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Set[Option[Boolean]]]`() =
    checkType(
      typeOf[Option[Set[Option[Boolean]]]]
    , typeOf[OptSetOptBoolWithSurrogateAggregate].member("optSetOptBool": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetOptBoolWithSurrogateAggregate().optSetOptBool === None)
  }
}

package com.dslplatform.ocd.aggregates

import OptListOptBoolWithSurrogateInAggregate.OptListOptBoolWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListOptBoolWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[Option[Boolean]]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Option[Boolean]]]]
    , typeOf[OptListOptBoolWithSurrogateAggregate].member("optListOptBool": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListOptBoolWithSurrogateAggregate().optListOptBool === None)
  }
}

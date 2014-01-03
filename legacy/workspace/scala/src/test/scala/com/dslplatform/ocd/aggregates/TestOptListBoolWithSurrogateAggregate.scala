package com.dslplatform.ocd.aggregates

import OptListBoolWithSurrogateInAggregate.OptListBoolWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListBoolWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[Boolean]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Boolean]]]
    , typeOf[OptListBoolWithSurrogateAggregate].member("optListBool": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListBoolWithSurrogateAggregate().optListBool === None)
  }
}

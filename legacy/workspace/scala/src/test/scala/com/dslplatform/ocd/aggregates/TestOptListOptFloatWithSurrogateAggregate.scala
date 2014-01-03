package com.dslplatform.ocd.aggregates

import OptListOptFloatWithSurrogateInAggregate.OptListOptFloatWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListOptFloatWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[Option[Float]]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Option[Float]]]]
    , typeOf[OptListOptFloatWithSurrogateAggregate].member("optListOptFloat": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListOptFloatWithSurrogateAggregate().optListOptFloat === None)
  }
}

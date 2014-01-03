package com.dslplatform.ocd.aggregates

import OptListOptLongWithSurrogateInAggregate.OptListOptLongWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListOptLongWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[Option[Long]]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Option[Long]]]]
    , typeOf[OptListOptLongWithSurrogateAggregate].member("optListOptLong": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListOptLongWithSurrogateAggregate().optListOptLong === None)
  }
}

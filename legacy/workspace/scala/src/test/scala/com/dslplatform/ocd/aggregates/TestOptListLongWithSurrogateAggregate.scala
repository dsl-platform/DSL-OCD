package com.dslplatform.ocd.aggregates

import OptListLongWithSurrogateInAggregate.OptListLongWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListLongWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[Long]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Long]]]
    , typeOf[OptListLongWithSurrogateAggregate].member("optListLong": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListLongWithSurrogateAggregate().optListLong === None)
  }
}

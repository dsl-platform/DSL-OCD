package com.dslplatform.ocd.aggregates

import ListLongInAggregate.ListLongAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListLongAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Long]`() =
    checkType(
      typeOf[IndexedSeq[Long]]
    , typeOf[ListLongAggregate].member("listLong": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Long]`() {
    assert(ListLongAggregate().listLong === IndexedSeq.empty[Long])
  }
}

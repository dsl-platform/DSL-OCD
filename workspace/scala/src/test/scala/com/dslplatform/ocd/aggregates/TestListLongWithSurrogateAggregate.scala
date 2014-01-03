package com.dslplatform.ocd.aggregates

import ListLongWithSurrogateInAggregate.ListLongWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListLongWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Long]`() =
    checkType(
      typeOf[IndexedSeq[Long]]
    , typeOf[ListLongWithSurrogateAggregate].member("listLong": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Long]`() {
    assert(ListLongWithSurrogateAggregate().listLong === IndexedSeq.empty[Long])
  }
}

package com.dslplatform.ocd.aggregates

import ListIntInAggregate.ListIntAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListIntAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Int]`() =
    checkType(
      typeOf[IndexedSeq[Int]]
    , typeOf[ListIntAggregate].member("listInt": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Int]`() {
    assert(ListIntAggregate().listInt === IndexedSeq.empty[Int])
  }
}

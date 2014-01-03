package com.dslplatform.ocd.aggregates

import ListFloatInAggregate.ListFloatAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListFloatAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Float]`() =
    checkType(
      typeOf[IndexedSeq[Float]]
    , typeOf[ListFloatAggregate].member("listFloat": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Float]`() {
    assert(ListFloatAggregate().listFloat === IndexedSeq.empty[Float])
  }
}

package com.dslplatform.ocd.aggregates

import ListIntWithSurrogateInAggregate.ListIntWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListIntWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Int]`() =
    checkType(
      typeOf[IndexedSeq[Int]]
    , typeOf[ListIntWithSurrogateAggregate].member("listInt": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Int]`() {
    assert(ListIntWithSurrogateAggregate().listInt === IndexedSeq.empty[Int])
  }
}

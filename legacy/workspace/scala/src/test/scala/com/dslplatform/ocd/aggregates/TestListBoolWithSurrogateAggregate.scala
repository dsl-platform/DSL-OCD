package com.dslplatform.ocd.aggregates

import ListBoolWithSurrogateInAggregate.ListBoolWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListBoolWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Boolean]`() =
    checkType(
      typeOf[IndexedSeq[Boolean]]
    , typeOf[ListBoolWithSurrogateAggregate].member("listBool": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Boolean]`() {
    assert(ListBoolWithSurrogateAggregate().listBool === IndexedSeq.empty[Boolean])
  }
}

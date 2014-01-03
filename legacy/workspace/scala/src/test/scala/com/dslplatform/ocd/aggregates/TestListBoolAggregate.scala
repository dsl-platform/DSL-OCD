package com.dslplatform.ocd.aggregates

import ListBoolInAggregate.ListBoolAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListBoolAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Boolean]`() =
    checkType(
      typeOf[IndexedSeq[Boolean]]
    , typeOf[ListBoolAggregate].member("listBool": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Boolean]`() {
    assert(ListBoolAggregate().listBool === IndexedSeq.empty[Boolean])
  }
}

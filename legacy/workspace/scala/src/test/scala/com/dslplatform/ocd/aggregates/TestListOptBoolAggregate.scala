package com.dslplatform.ocd.aggregates

import ListOptBoolInAggregate.ListOptBoolAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptBoolAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Option[Boolean]]`() =
    checkType(
      typeOf[IndexedSeq[Option[Boolean]]]
    , typeOf[ListOptBoolAggregate].member("listOptBool": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Option[Boolean]]`() {
    assert(ListOptBoolAggregate().listOptBool === IndexedSeq.empty[Option[Boolean]])
  }
}

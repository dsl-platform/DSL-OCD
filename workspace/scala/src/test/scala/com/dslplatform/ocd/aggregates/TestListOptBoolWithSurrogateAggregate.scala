package com.dslplatform.ocd.aggregates

import ListOptBoolWithSurrogateInAggregate.ListOptBoolWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptBoolWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Option[Boolean]]`() =
    checkType(
      typeOf[IndexedSeq[Option[Boolean]]]
    , typeOf[ListOptBoolWithSurrogateAggregate].member("listOptBool": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Option[Boolean]]`() {
    assert(ListOptBoolWithSurrogateAggregate().listOptBool === IndexedSeq.empty[Option[Boolean]])
  }
}

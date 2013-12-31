package com.dslplatform.ocd.aggregates

import ListOptDoubleInAggregate.ListOptDoubleAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptDoubleAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Option[Double]]`() =
    checkType(
      typeOf[IndexedSeq[Option[Double]]]
    , typeOf[ListOptDoubleAggregate].member("listOptDouble": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Option[Double]]`() {
    assert(ListOptDoubleAggregate().listOptDouble === IndexedSeq.empty[Option[Double]])
  }
}

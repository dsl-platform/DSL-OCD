package com.dslplatform.ocd.aggregates

import ListDoubleInAggregate.ListDoubleAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListDoubleAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Double]`() =
    checkType(
      typeOf[IndexedSeq[Double]]
    , typeOf[ListDoubleAggregate].member("listDouble": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Double]`() {
    assert(ListDoubleAggregate().listDouble === IndexedSeq.empty[Double])
  }
}

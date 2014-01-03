package com.dslplatform.ocd.aggregates

import ListDoubleWithSurrogateInAggregate.ListDoubleWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListDoubleWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Double]`() =
    checkType(
      typeOf[IndexedSeq[Double]]
    , typeOf[ListDoubleWithSurrogateAggregate].member("listDouble": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Double]`() {
    assert(ListDoubleWithSurrogateAggregate().listDouble === IndexedSeq.empty[Double])
  }
}

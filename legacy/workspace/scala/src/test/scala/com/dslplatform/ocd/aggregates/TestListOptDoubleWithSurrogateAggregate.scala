package com.dslplatform.ocd.aggregates

import ListOptDoubleWithSurrogateInAggregate.ListOptDoubleWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptDoubleWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Option[Double]]`() =
    checkType(
      typeOf[IndexedSeq[Option[Double]]]
    , typeOf[ListOptDoubleWithSurrogateAggregate].member("listOptDouble": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Option[Double]]`() {
    assert(ListOptDoubleWithSurrogateAggregate().listOptDouble === IndexedSeq.empty[Option[Double]])
  }
}

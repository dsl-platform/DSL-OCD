package com.dslplatform.ocd.aggregates

import OptListOptDoubleWithSurrogateInAggregate.OptListOptDoubleWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListOptDoubleWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[Option[Double]]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Option[Double]]]]
    , typeOf[OptListOptDoubleWithSurrogateAggregate].member("optListOptDouble": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListOptDoubleWithSurrogateAggregate().optListOptDouble === None)
  }
}

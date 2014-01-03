package com.dslplatform.ocd.aggregates

import OptSetOptDoubleWithSurrogateInAggregate.OptSetOptDoubleWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetOptDoubleWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Set[Option[Double]]]`() =
    checkType(
      typeOf[Option[Set[Option[Double]]]]
    , typeOf[OptSetOptDoubleWithSurrogateAggregate].member("optSetOptDouble": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetOptDoubleWithSurrogateAggregate().optSetOptDouble === None)
  }
}

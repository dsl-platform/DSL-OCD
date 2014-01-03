package com.dslplatform.ocd.aggregates

import SetOptDoubleWithSurrogateInAggregate.SetOptDoubleWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptDoubleWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Set[Option[Double]]`() =
    checkType(
      typeOf[Set[Option[Double]]]
    , typeOf[SetOptDoubleWithSurrogateAggregate].member("setOptDouble": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Option[Double]]`() {
    assert(SetOptDoubleWithSurrogateAggregate().setOptDouble === Set.empty[Option[Double]])
  }
}

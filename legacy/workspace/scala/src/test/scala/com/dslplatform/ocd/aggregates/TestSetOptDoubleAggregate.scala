package com.dslplatform.ocd.aggregates

import SetOptDoubleInAggregate.SetOptDoubleAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptDoubleAggregate extends SpecExtensions {
  def `Test property field type: Set[Option[Double]]`() =
    checkType(
      typeOf[Set[Option[Double]]]
    , typeOf[SetOptDoubleAggregate].member("setOptDouble": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Option[Double]]`() {
    assert(SetOptDoubleAggregate().setOptDouble === Set.empty[Option[Double]])
  }
}

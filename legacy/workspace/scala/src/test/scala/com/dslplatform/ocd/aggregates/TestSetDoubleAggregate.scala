package com.dslplatform.ocd.aggregates

import SetDoubleInAggregate.SetDoubleAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetDoubleAggregate extends SpecExtensions {
  def `Test property field type: Set[Double]`() =
    checkType(
      typeOf[Set[Double]]
    , typeOf[SetDoubleAggregate].member("setDouble": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Double]`() {
    assert(SetDoubleAggregate().setDouble === Set.empty[Double])
  }
}

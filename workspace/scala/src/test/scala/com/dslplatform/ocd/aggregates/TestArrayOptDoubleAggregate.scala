package com.dslplatform.ocd.aggregates

import ArrayOptDoubleInAggregate.ArrayOptDoubleAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptDoubleAggregate extends SpecExtensions {
  def `Test property field type: Array[Option[Double]]`() =
    checkType(
      typeOf[Array[Option[Double]]]
    , typeOf[ArrayOptDoubleAggregate].member("arrayOptDouble": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Option[Double]]`() {
    assert(ArrayOptDoubleAggregate().arrayOptDouble === Array.empty[Option[Double]])
  }
}

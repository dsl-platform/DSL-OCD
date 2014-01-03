package com.dslplatform.ocd.aggregates

import ArrayOptDoubleWithSurrogateInAggregate.ArrayOptDoubleWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptDoubleWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Array[Option[Double]]`() =
    checkType(
      typeOf[Array[Option[Double]]]
    , typeOf[ArrayOptDoubleWithSurrogateAggregate].member("arrayOptDouble": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Option[Double]]`() {
    assert(ArrayOptDoubleWithSurrogateAggregate().arrayOptDouble === Array.empty[Option[Double]])
  }
}

package com.dslplatform.ocd.aggregates

import OptArrayOptDoubleWithSurrogateInAggregate.OptArrayOptDoubleWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayOptDoubleWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Array[Option[Double]]]`() =
    checkType(
      typeOf[Option[Array[Option[Double]]]]
    , typeOf[OptArrayOptDoubleWithSurrogateAggregate].member("optArrayOptDouble": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayOptDoubleWithSurrogateAggregate().optArrayOptDouble === None)
  }
}

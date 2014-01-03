package com.dslplatform.ocd.aggregates

import OptDoubleWithSurrogateInAggregate.OptDoubleWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptDoubleWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Double]`() =
    checkType(
      typeOf[Option[Double]]
    , typeOf[OptDoubleWithSurrogateAggregate].member("optDouble": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptDoubleWithSurrogateAggregate().optDouble === None)
  }
}

package com.dslplatform.ocd.aggregates

import OptSetDoubleWithSurrogateInAggregate.OptSetDoubleWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetDoubleWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Set[Double]]`() =
    checkType(
      typeOf[Option[Set[Double]]]
    , typeOf[OptSetDoubleWithSurrogateAggregate].member("optSetDouble": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetDoubleWithSurrogateAggregate().optSetDouble === None)
  }
}

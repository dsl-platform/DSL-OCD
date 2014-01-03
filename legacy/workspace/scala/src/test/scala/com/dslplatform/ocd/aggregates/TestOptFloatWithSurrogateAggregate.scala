package com.dslplatform.ocd.aggregates

import OptFloatWithSurrogateInAggregate.OptFloatWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptFloatWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Float]`() =
    checkType(
      typeOf[Option[Float]]
    , typeOf[OptFloatWithSurrogateAggregate].member("optFloat": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptFloatWithSurrogateAggregate().optFloat === None)
  }
}

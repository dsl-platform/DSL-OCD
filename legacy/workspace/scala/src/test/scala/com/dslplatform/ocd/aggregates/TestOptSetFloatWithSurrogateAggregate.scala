package com.dslplatform.ocd.aggregates

import OptSetFloatWithSurrogateInAggregate.OptSetFloatWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetFloatWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Set[Float]]`() =
    checkType(
      typeOf[Option[Set[Float]]]
    , typeOf[OptSetFloatWithSurrogateAggregate].member("optSetFloat": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetFloatWithSurrogateAggregate().optSetFloat === None)
  }
}

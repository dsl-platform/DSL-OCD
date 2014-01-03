package com.dslplatform.ocd.aggregates

import OptSetOptFloatWithSurrogateInAggregate.OptSetOptFloatWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetOptFloatWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Set[Option[Float]]]`() =
    checkType(
      typeOf[Option[Set[Option[Float]]]]
    , typeOf[OptSetOptFloatWithSurrogateAggregate].member("optSetOptFloat": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetOptFloatWithSurrogateAggregate().optSetOptFloat === None)
  }
}

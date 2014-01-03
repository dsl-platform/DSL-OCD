package com.dslplatform.ocd.aggregates

import SetOptFloatWithSurrogateInAggregate.SetOptFloatWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptFloatWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Set[Option[Float]]`() =
    checkType(
      typeOf[Set[Option[Float]]]
    , typeOf[SetOptFloatWithSurrogateAggregate].member("setOptFloat": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Option[Float]]`() {
    assert(SetOptFloatWithSurrogateAggregate().setOptFloat === Set.empty[Option[Float]])
  }
}

package com.dslplatform.ocd.aggregates

import SetFloatWithSurrogateInAggregate.SetFloatWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetFloatWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Set[Float]`() =
    checkType(
      typeOf[Set[Float]]
    , typeOf[SetFloatWithSurrogateAggregate].member("setFloat": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Float]`() {
    assert(SetFloatWithSurrogateAggregate().setFloat === Set.empty[Float])
  }
}

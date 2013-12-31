package com.dslplatform.ocd.aggregates

import SetFloatInAggregate.SetFloatAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetFloatAggregate extends SpecExtensions {
  def `Test property field type: Set[Float]`() =
    checkType(
      typeOf[Set[Float]]
    , typeOf[SetFloatAggregate].member("setFloat": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Float]`() {
    assert(SetFloatAggregate().setFloat === Set.empty[Float])
  }
}

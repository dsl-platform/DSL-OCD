package com.dslplatform.ocd.aggregates

import SetBoolWithSurrogateInAggregate.SetBoolWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetBoolWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Set[Boolean]`() =
    checkType(
      typeOf[Set[Boolean]]
    , typeOf[SetBoolWithSurrogateAggregate].member("setBool": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Boolean]`() {
    assert(SetBoolWithSurrogateAggregate().setBool === Set.empty[Boolean])
  }
}

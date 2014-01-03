package com.dslplatform.ocd.aggregates

import SetBoolInAggregate.SetBoolAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetBoolAggregate extends SpecExtensions {
  def `Test property field type: Set[Boolean]`() =
    checkType(
      typeOf[Set[Boolean]]
    , typeOf[SetBoolAggregate].member("setBool": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Boolean]`() {
    assert(SetBoolAggregate().setBool === Set.empty[Boolean])
  }
}

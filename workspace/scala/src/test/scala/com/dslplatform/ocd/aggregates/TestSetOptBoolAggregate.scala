package com.dslplatform.ocd.aggregates

import SetOptBoolInAggregate.SetOptBoolAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptBoolAggregate extends SpecExtensions {
  def `Test property field type: Set[Option[Boolean]]`() =
    checkType(
      typeOf[Set[Option[Boolean]]]
    , typeOf[SetOptBoolAggregate].member("setOptBool": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Option[Boolean]]`() {
    assert(SetOptBoolAggregate().setOptBool === Set.empty[Option[Boolean]])
  }
}

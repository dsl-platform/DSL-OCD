package com.dslplatform.ocd.aggregates

import SetOptFloatInAggregate.SetOptFloatAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptFloatAggregate extends SpecExtensions {
  def `Test property field type: Set[Option[Float]]`() =
    checkType(
      typeOf[Set[Option[Float]]]
    , typeOf[SetOptFloatAggregate].member("setOptFloat": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Option[Float]]`() {
    assert(SetOptFloatAggregate().setOptFloat === Set.empty[Option[Float]])
  }
}

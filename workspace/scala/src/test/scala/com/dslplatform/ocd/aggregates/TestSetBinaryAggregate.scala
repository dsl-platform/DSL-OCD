package com.dslplatform.ocd.aggregates

import SetBinaryInAggregate.SetBinaryAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetBinaryAggregate extends SpecExtensions {
  def `Test property field type: Set[Array[Byte]]`() =
    checkType(
      typeOf[Set[Array[Byte]]]
    , typeOf[SetBinaryAggregate].member("setBinary": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Array[Byte]]`() {
    assert(SetBinaryAggregate().setBinary === Set.empty[Array[Byte]])
  }
}

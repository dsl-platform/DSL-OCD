package com.dslplatform.ocd.values

import SetBinaryInValue.SetBinaryValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetBinaryValue extends SpecExtensions {
  def `Test property field type: Set[Array[Byte]]`() =
    checkType(
      typeOf[Set[Array[Byte]]]
    , typeOf[SetBinaryValue].member("setBinary": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Array[Byte]]`() {
    assert(SetBinaryValue().setBinary === Set.empty[Array[Byte]])
  }
}

package com.dslplatform.ocd.values

import SetOptBinaryInValue.SetOptBinaryValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptBinaryValue extends SpecExtensions {
  def `Test property field type: Set[Option[Array[Byte]]]`() =
    checkType(
      typeOf[Set[Option[Array[Byte]]]]
    , typeOf[SetOptBinaryValue].member("setOptBinary": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Option[Array[Byte]]]`() {
    assert(SetOptBinaryValue().setOptBinary === Set.empty[Option[Array[Byte]]])
  }
}

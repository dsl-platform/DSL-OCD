package com.dslplatform.ocd.values

import OptBinaryInValue.OptBinaryValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptBinaryValue extends SpecExtensions {
  def `Test property field type: Option[Array[Byte]]`() =
    checkType(
      typeOf[Option[Array[Byte]]]
    , typeOf[OptBinaryValue].member("optBinary": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptBinaryValue().optBinary === None)
  }
}

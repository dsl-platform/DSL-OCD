package com.dslplatform.ocd.values

import OptArrayBinaryInValue.OptArrayBinaryValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayBinaryValue extends SpecExtensions {
  def `Test property field type: Option[Array[Array[Byte]]]`() =
    checkType(
      typeOf[Option[Array[Array[Byte]]]]
    , typeOf[OptArrayBinaryValue].member("optArrayBinary": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayBinaryValue().optArrayBinary === None)
  }
}

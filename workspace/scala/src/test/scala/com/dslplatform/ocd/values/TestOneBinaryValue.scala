package com.dslplatform.ocd.values

import OneBinaryInValue.OneBinaryValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneBinaryValue extends SpecExtensions {
  def `Test property field type: Array[Byte]`() =
    checkType(
      typeOf[Array[Byte]]
    , typeOf[OneBinaryValue].member("oneBinary": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Byte]`() {
    assert(OneBinaryValue().oneBinary === Array.empty[Byte])
  }
}

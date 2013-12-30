package com.dslplatform.ocd.values

import OneBinaryInValue.OneBinaryValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneBinaryValue extends SpecExtensions {
  def `Check single property type via reflection: Array[Byte]`() =
    checkType(
      typeOf[Array[Byte]]
    , typeOf[OneBinaryValue].member("oneBinary": TermName).asMethod.returnType
    )
}

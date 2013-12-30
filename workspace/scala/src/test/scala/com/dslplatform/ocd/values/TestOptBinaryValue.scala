package com.dslplatform.ocd.values

import OptBinaryInValue.OptBinaryValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptBinaryValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Array[Byte]]`() =
    checkType(
      typeOf[Option[Array[Byte]]]
    , typeOf[OptBinaryValue].member("optBinary": TermName).asMethod.returnType
    )
}

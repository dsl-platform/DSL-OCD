package com.dslplatform.ocd.values

import OptArrayBinaryInValue.OptArrayBinaryValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayBinaryValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Array[Array[Byte]]]`() =
    checkType(
      typeOf[Option[Array[Array[Byte]]]]
    , typeOf[OptArrayBinaryValue].member("optArrayBinary": TermName).asMethod.returnType
    )
}

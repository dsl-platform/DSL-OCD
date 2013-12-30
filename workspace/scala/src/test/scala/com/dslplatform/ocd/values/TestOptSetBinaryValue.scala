package com.dslplatform.ocd.values

import OptSetBinaryInValue.OptSetBinaryValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetBinaryValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Set[Array[Byte]]]`() =
    checkType(
      typeOf[Option[Set[Array[Byte]]]]
    , typeOf[OptSetBinaryValue].member("optSetBinary": TermName).asMethod.returnType
    )
}

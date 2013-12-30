package com.dslplatform.ocd.values

import OptSetOptBinaryInValue.OptSetOptBinaryValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetOptBinaryValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Set[Option[Array[Byte]]]]`() =
    checkType(
      typeOf[Option[Set[Option[Array[Byte]]]]]
    , typeOf[OptSetOptBinaryValue].member("optSetOptBinary": TermName).asMethod.returnType
    )
}

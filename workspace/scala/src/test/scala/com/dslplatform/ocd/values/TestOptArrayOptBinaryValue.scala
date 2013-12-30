package com.dslplatform.ocd.values

import OptArrayOptBinaryInValue.OptArrayOptBinaryValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayOptBinaryValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Array[Option[Array[Byte]]]]`() =
    checkType(
      typeOf[Option[Array[Option[Array[Byte]]]]]
    , typeOf[OptArrayOptBinaryValue].member("optArrayOptBinary": TermName).asMethod.returnType
    )
}

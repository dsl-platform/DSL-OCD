package com.dslplatform.ocd.values

import ArrayOptBinaryInValue.ArrayOptBinaryValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptBinaryValue extends SpecExtensions {
  def `Check single property type via reflection: Array[Option[Array[Byte]]]`() =
    checkType(
      typeOf[Array[Option[Array[Byte]]]]
    , typeOf[ArrayOptBinaryValue].member("arrayOptBinary": TermName).asMethod.returnType
    )
}

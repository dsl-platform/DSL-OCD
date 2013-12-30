package com.dslplatform.ocd.values

import SetOptBinaryInValue.SetOptBinaryValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptBinaryValue extends SpecExtensions {
  def `Check single property type via reflection: Set[Option[Array[Byte]]]`() =
    checkType(
      typeOf[Set[Option[Array[Byte]]]]
    , typeOf[SetOptBinaryValue].member("setOptBinary": TermName).asMethod.returnType
    )
}

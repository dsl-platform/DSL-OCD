package com.dslplatform.ocd.values

import SetBinaryInValue.SetBinaryValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetBinaryValue extends SpecExtensions {
  def `Check single property type via reflection: Set[Array[Byte]]`() =
    checkType(
      typeOf[Set[Array[Byte]]]
    , typeOf[SetBinaryValue].member("setBinary": TermName).asMethod.returnType
    )
}

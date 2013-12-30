package com.dslplatform.ocd.values

import ArrayStringInValue.ArrayStringValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayStringValue extends SpecExtensions {
  def `Check single property type via reflection: Array[String]`() =
    checkType(
      typeOf[Array[String]]
    , typeOf[ArrayStringValue].member("arrayString": TermName).asMethod.returnType
    )
}

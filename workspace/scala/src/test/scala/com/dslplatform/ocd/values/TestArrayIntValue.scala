package com.dslplatform.ocd.values

import ArrayIntInValue.ArrayIntValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayIntValue extends SpecExtensions {
  def `Check single property type via reflection: Array[Int]`() =
    checkType(
      typeOf[Array[Int]]
    , typeOf[ArrayIntValue].member("arrayInt": TermName).asMethod.returnType
    )
}

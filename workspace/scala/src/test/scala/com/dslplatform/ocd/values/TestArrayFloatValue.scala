package com.dslplatform.ocd.values

import ArrayFloatInValue.ArrayFloatValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayFloatValue extends SpecExtensions {
  def `Check single property type via reflection: Array[Float]`() =
    checkType(
      typeOf[Array[Float]]
    , typeOf[ArrayFloatValue].member("arrayFloat": TermName).asMethod.returnType
    )
}

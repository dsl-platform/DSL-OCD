package com.dslplatform.ocd.values

import OneIntInValue.OneIntValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneIntValue extends SpecExtensions {
  def `Check single property type via reflection: Int`() =
    checkType(
      typeOf[Int]
    , typeOf[OneIntValue].member("oneInt": TermName).asMethod.returnType
    )
}

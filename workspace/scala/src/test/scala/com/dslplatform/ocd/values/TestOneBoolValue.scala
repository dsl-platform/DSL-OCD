package com.dslplatform.ocd.values

import OneBoolInValue.OneBoolValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneBoolValue extends SpecExtensions {
  def `Check single property type via reflection: Boolean`() =
    checkType(
      typeOf[Boolean]
    , typeOf[OneBoolValue].member("oneBool": TermName).asMethod.returnType
    )
}

package com.dslplatform.ocd.values

import OptBoolInValue.OptBoolValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptBoolValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Boolean]`() =
    checkType(
      typeOf[Option[Boolean]]
    , typeOf[OptBoolValue].member("optBool": TermName).asMethod.returnType
    )
}

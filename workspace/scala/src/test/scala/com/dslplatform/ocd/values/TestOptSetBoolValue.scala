package com.dslplatform.ocd.values

import OptSetBoolInValue.OptSetBoolValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetBoolValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Set[Boolean]]`() =
    checkType(
      typeOf[Option[Set[Boolean]]]
    , typeOf[OptSetBoolValue].member("optSetBool": TermName).asMethod.returnType
    )
}

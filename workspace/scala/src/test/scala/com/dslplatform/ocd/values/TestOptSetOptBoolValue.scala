package com.dslplatform.ocd.values

import OptSetOptBoolInValue.OptSetOptBoolValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetOptBoolValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Set[Option[Boolean]]]`() =
    checkType(
      typeOf[Option[Set[Option[Boolean]]]]
    , typeOf[OptSetOptBoolValue].member("optSetOptBool": TermName).asMethod.returnType
    )
}

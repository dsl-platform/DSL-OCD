package com.dslplatform.ocd.values

import OptStringInValue.OptStringValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptStringValue extends SpecExtensions {
  def `Check single property type via reflection: Option[String]`() =
    checkType(
      typeOf[Option[String]]
    , typeOf[OptStringValue].member("optString": TermName).asMethod.returnType
    )
}

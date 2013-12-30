package com.dslplatform.ocd.values

import OptSetStringInValue.OptSetStringValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetStringValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Set[String]]`() =
    checkType(
      typeOf[Option[Set[String]]]
    , typeOf[OptSetStringValue].member("optSetString": TermName).asMethod.returnType
    )
}

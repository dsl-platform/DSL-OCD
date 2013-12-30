package com.dslplatform.ocd.values

import OptSetOptStringInValue.OptSetOptStringValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetOptStringValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Set[Option[String]]]`() =
    checkType(
      typeOf[Option[Set[Option[String]]]]
    , typeOf[OptSetOptStringValue].member("optSetOptString": TermName).asMethod.returnType
    )
}

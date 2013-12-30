package com.dslplatform.ocd.values

import OptSetMapInValue.OptSetMapValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetMapValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Set[Map[String, String]]]`() =
    checkType(
      typeOf[Option[Set[Map[String, String]]]]
    , typeOf[OptSetMapValue].member("optSetMap": TermName).asMethod.returnType
    )
}

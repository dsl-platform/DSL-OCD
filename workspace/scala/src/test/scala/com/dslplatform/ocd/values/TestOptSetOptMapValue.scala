package com.dslplatform.ocd.values

import OptSetOptMapInValue.OptSetOptMapValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetOptMapValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Set[Option[Map[String, String]]]]`() =
    checkType(
      typeOf[Option[Set[Option[Map[String, String]]]]]
    , typeOf[OptSetOptMapValue].member("optSetOptMap": TermName).asMethod.returnType
    )
}

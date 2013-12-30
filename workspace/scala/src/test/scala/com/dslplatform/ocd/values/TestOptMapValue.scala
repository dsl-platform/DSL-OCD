package com.dslplatform.ocd.values

import OptMapInValue.OptMapValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptMapValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Map[String, String]]`() =
    checkType(
      typeOf[Option[Map[String, String]]]
    , typeOf[OptMapValue].member("optMap": TermName).asMethod.returnType
    )
}

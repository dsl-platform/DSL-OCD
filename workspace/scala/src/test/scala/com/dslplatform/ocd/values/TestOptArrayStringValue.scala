package com.dslplatform.ocd.values

import OptArrayStringInValue.OptArrayStringValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayStringValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Array[String]]`() =
    checkType(
      typeOf[Option[Array[String]]]
    , typeOf[OptArrayStringValue].member("optArrayString": TermName).asMethod.returnType
    )
}

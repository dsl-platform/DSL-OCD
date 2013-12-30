package com.dslplatform.ocd.values

import ArrayOptStringInValue.ArrayOptStringValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptStringValue extends SpecExtensions {
  def `Check single property type via reflection: Array[Option[String]]`() =
    checkType(
      typeOf[Array[Option[String]]]
    , typeOf[ArrayOptStringValue].member("arrayOptString": TermName).asMethod.returnType
    )
}

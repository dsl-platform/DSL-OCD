package com.dslplatform.ocd.values

import OptArrayOptStringInValue.OptArrayOptStringValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayOptStringValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Array[Option[String]]]`() =
    checkType(
      typeOf[Option[Array[Option[String]]]]
    , typeOf[OptArrayOptStringValue].member("optArrayOptString": TermName).asMethod.returnType
    )
}

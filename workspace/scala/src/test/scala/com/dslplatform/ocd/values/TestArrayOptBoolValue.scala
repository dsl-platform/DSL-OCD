package com.dslplatform.ocd.values

import ArrayOptBoolInValue.ArrayOptBoolValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptBoolValue extends SpecExtensions {
  def `Check single property type via reflection: Array[Option[Boolean]]`() =
    checkType(
      typeOf[Array[Option[Boolean]]]
    , typeOf[ArrayOptBoolValue].member("arrayOptBool": TermName).asMethod.returnType
    )
}

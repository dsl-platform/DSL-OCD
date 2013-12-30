package com.dslplatform.ocd.values

import OptArrayBoolInValue.OptArrayBoolValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayBoolValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Array[Boolean]]`() =
    checkType(
      typeOf[Option[Array[Boolean]]]
    , typeOf[OptArrayBoolValue].member("optArrayBool": TermName).asMethod.returnType
    )
}

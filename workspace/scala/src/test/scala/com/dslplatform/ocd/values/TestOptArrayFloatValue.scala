package com.dslplatform.ocd.values

import OptArrayFloatInValue.OptArrayFloatValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayFloatValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Array[Float]]`() =
    checkType(
      typeOf[Option[Array[Float]]]
    , typeOf[OptArrayFloatValue].member("optArrayFloat": TermName).asMethod.returnType
    )
}

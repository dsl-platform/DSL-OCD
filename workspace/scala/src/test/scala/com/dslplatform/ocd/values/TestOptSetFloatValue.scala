package com.dslplatform.ocd.values

import OptSetFloatInValue.OptSetFloatValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetFloatValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Set[Float]]`() =
    checkType(
      typeOf[Option[Set[Float]]]
    , typeOf[OptSetFloatValue].member("optSetFloat": TermName).asMethod.returnType
    )
}

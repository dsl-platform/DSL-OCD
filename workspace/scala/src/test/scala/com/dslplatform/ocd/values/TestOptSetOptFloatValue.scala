package com.dslplatform.ocd.values

import OptSetOptFloatInValue.OptSetOptFloatValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetOptFloatValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Set[Option[Float]]]`() =
    checkType(
      typeOf[Option[Set[Option[Float]]]]
    , typeOf[OptSetOptFloatValue].member("optSetOptFloat": TermName).asMethod.returnType
    )
}

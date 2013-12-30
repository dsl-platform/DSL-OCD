package com.dslplatform.ocd.values

import OptFloatInValue.OptFloatValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptFloatValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Float]`() =
    checkType(
      typeOf[Option[Float]]
    , typeOf[OptFloatValue].member("optFloat": TermName).asMethod.returnType
    )
}

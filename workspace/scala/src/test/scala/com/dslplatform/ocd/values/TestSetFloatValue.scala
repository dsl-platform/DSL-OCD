package com.dslplatform.ocd.values

import SetFloatInValue.SetFloatValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetFloatValue extends SpecExtensions {
  def `Check single property type via reflection: Set[Float]`() =
    checkType(
      typeOf[Set[Float]]
    , typeOf[SetFloatValue].member("setFloat": TermName).asMethod.returnType
    )
}

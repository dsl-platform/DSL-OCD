package com.dslplatform.ocd.values

import SetBoolInValue.SetBoolValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetBoolValue extends SpecExtensions {
  def `Check single property type via reflection: Set[Boolean]`() =
    checkType(
      typeOf[Set[Boolean]]
    , typeOf[SetBoolValue].member("setBool": TermName).asMethod.returnType
    )
}

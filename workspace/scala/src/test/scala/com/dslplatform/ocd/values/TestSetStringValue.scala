package com.dslplatform.ocd.values

import SetStringInValue.SetStringValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetStringValue extends SpecExtensions {
  def `Check single property type via reflection: Set[String]`() =
    checkType(
      typeOf[Set[String]]
    , typeOf[SetStringValue].member("setString": TermName).asMethod.returnType
    )
}

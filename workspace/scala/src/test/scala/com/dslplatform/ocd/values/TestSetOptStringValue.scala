package com.dslplatform.ocd.values

import SetOptStringInValue.SetOptStringValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptStringValue extends SpecExtensions {
  def `Check single property type via reflection: Set[Option[String]]`() =
    checkType(
      typeOf[Set[Option[String]]]
    , typeOf[SetOptStringValue].member("setOptString": TermName).asMethod.returnType
    )
}

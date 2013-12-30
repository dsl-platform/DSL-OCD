package com.dslplatform.ocd.values

import SetMapInValue.SetMapValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetMapValue extends SpecExtensions {
  def `Check single property type via reflection: Set[Map[String, String]]`() =
    checkType(
      typeOf[Set[Map[String, String]]]
    , typeOf[SetMapValue].member("setMap": TermName).asMethod.returnType
    )
}

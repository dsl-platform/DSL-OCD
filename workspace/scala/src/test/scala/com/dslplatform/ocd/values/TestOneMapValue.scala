package com.dslplatform.ocd.values

import OneMapInValue.OneMapValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneMapValue extends SpecExtensions {
  def `Check single property type via reflection: Map[String, String]`() =
    checkType(
      typeOf[Map[String, String]]
    , typeOf[OneMapValue].member("oneMap": TermName).asMethod.returnType
    )
}

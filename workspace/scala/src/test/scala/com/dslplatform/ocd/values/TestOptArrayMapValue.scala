package com.dslplatform.ocd.values

import OptArrayMapInValue.OptArrayMapValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayMapValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Array[Map[String, String]]]`() =
    checkType(
      typeOf[Option[Array[Map[String, String]]]]
    , typeOf[OptArrayMapValue].member("optArrayMap": TermName).asMethod.returnType
    )
}

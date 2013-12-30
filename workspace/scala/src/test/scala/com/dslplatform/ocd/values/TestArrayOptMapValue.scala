package com.dslplatform.ocd.values

import ArrayOptMapInValue.ArrayOptMapValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptMapValue extends SpecExtensions {
  def `Check single property type via reflection: Array[Option[Map[String, String]]]`() =
    checkType(
      typeOf[Array[Option[Map[String, String]]]]
    , typeOf[ArrayOptMapValue].member("arrayOptMap": TermName).asMethod.returnType
    )
}

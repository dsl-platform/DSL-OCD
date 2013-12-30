package com.dslplatform.ocd.values

import OptArrayOptMapInValue.OptArrayOptMapValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayOptMapValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Array[Option[Map[String, String]]]]`() =
    checkType(
      typeOf[Option[Array[Option[Map[String, String]]]]]
    , typeOf[OptArrayOptMapValue].member("optArrayOptMap": TermName).asMethod.returnType
    )
}

package com.dslplatform.ocd.values

import OptListOptMapInValue.OptListOptMapValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListOptMapValue extends SpecExtensions {
  def `Check single property type via reflection: Option[IndexedSeq[Option[Map[String, String]]]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Option[Map[String, String]]]]]
    , typeOf[OptListOptMapValue].member("optListOptMap": TermName).asMethod.returnType
    )
}

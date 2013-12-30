package com.dslplatform.ocd.values

import OptListMapInValue.OptListMapValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListMapValue extends SpecExtensions {
  def `Check single property type via reflection: Option[IndexedSeq[Map[String, String]]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Map[String, String]]]]
    , typeOf[OptListMapValue].member("optListMap": TermName).asMethod.returnType
    )
}

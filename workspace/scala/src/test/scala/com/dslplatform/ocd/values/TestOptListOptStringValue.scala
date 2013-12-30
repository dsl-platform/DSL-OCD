package com.dslplatform.ocd.values

import OptListOptStringInValue.OptListOptStringValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListOptStringValue extends SpecExtensions {
  def `Check single property type via reflection: Option[IndexedSeq[Option[String]]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Option[String]]]]
    , typeOf[OptListOptStringValue].member("optListOptString": TermName).asMethod.returnType
    )
}

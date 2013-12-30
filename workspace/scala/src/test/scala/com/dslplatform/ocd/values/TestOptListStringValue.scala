package com.dslplatform.ocd.values

import OptListStringInValue.OptListStringValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListStringValue extends SpecExtensions {
  def `Check single property type via reflection: Option[IndexedSeq[String]]`() =
    checkType(
      typeOf[Option[IndexedSeq[String]]]
    , typeOf[OptListStringValue].member("optListString": TermName).asMethod.returnType
    )
}

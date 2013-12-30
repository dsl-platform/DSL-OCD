package com.dslplatform.ocd.values

import OptListOptBoolInValue.OptListOptBoolValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListOptBoolValue extends SpecExtensions {
  def `Check single property type via reflection: Option[IndexedSeq[Option[Boolean]]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Option[Boolean]]]]
    , typeOf[OptListOptBoolValue].member("optListOptBool": TermName).asMethod.returnType
    )
}

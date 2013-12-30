package com.dslplatform.ocd.values

import OptListBoolInValue.OptListBoolValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListBoolValue extends SpecExtensions {
  def `Check single property type via reflection: Option[IndexedSeq[Boolean]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Boolean]]]
    , typeOf[OptListBoolValue].member("optListBool": TermName).asMethod.returnType
    )
}

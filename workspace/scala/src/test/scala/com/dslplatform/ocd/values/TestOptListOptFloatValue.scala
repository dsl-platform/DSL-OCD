package com.dslplatform.ocd.values

import OptListOptFloatInValue.OptListOptFloatValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListOptFloatValue extends SpecExtensions {
  def `Check single property type via reflection: Option[IndexedSeq[Option[Float]]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Option[Float]]]]
    , typeOf[OptListOptFloatValue].member("optListOptFloat": TermName).asMethod.returnType
    )
}

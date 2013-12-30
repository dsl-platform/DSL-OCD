package com.dslplatform.ocd.values

import OptListFloatInValue.OptListFloatValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListFloatValue extends SpecExtensions {
  def `Check single property type via reflection: Option[IndexedSeq[Float]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Float]]]
    , typeOf[OptListFloatValue].member("optListFloat": TermName).asMethod.returnType
    )
}

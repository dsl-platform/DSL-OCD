package com.dslplatform.ocd.values

import OptListIntInValue.OptListIntValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListIntValue extends SpecExtensions {
  def `Check single property type via reflection: Option[IndexedSeq[Int]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Int]]]
    , typeOf[OptListIntValue].member("optListInt": TermName).asMethod.returnType
    )
}

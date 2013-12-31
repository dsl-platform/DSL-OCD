package com.dslplatform.ocd.values

import OptListIntInValue.OptListIntValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListIntValue extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[Int]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Int]]]
    , typeOf[OptListIntValue].member("optListInt": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListIntValue().optListInt === None)
  }
}

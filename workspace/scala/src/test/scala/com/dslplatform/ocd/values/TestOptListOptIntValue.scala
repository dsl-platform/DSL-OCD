package com.dslplatform.ocd.values

import OptListOptIntInValue.OptListOptIntValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListOptIntValue extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[Option[Int]]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Option[Int]]]]
    , typeOf[OptListOptIntValue].member("optListOptInt": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListOptIntValue().optListOptInt === None)
  }
}

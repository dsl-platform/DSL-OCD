package com.dslplatform.ocd.values

import OptSetIntInValue.OptSetIntValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetIntValue extends SpecExtensions {
  def `Test property field type: Option[Set[Int]]`() =
    checkType(
      typeOf[Option[Set[Int]]]
    , typeOf[OptSetIntValue].member("optSetInt": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetIntValue().optSetInt === None)
  }
}

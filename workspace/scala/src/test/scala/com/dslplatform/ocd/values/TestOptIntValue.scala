package com.dslplatform.ocd.values

import OptIntInValue.OptIntValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptIntValue extends SpecExtensions {
  def `Test property field type: Option[Int]`() =
    checkType(
      typeOf[Option[Int]]
    , typeOf[OptIntValue].member("optInt": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptIntValue().optInt === None)
  }
}

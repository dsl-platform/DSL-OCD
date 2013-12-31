package com.dslplatform.ocd.values

import OptArrayIntInValue.OptArrayIntValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayIntValue extends SpecExtensions {
  def `Test property field type: Option[Array[Int]]`() =
    checkType(
      typeOf[Option[Array[Int]]]
    , typeOf[OptArrayIntValue].member("optArrayInt": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayIntValue().optArrayInt === None)
  }
}

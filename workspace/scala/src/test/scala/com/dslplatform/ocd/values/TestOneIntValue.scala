package com.dslplatform.ocd.values

import OneIntInValue.OneIntValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneIntValue extends SpecExtensions {
  def `Test property field type: Int`() =
    checkType(
      typeOf[Int]
    , typeOf[OneIntValue].member("oneInt": TermName).asMethod.returnType
    )

  def `Test property default value: 0`() {
    assert(OneIntValue().oneInt === 0)
  }
}

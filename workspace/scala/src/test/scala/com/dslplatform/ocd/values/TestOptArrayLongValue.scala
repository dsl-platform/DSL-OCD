package com.dslplatform.ocd.values

import OptArrayLongInValue.OptArrayLongValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayLongValue extends SpecExtensions {
  def `Test property field type: Option[Array[Long]]`() =
    checkType(
      typeOf[Option[Array[Long]]]
    , typeOf[OptArrayLongValue].member("optArrayLong": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayLongValue().optArrayLong === None)
  }
}

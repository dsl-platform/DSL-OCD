package com.dslplatform.ocd.values

import OptLongInValue.OptLongValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptLongValue extends SpecExtensions {
  def `Test property field type: Option[Long]`() =
    checkType(
      typeOf[Option[Long]]
    , typeOf[OptLongValue].member("optLong": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptLongValue().optLong === None)
  }
}

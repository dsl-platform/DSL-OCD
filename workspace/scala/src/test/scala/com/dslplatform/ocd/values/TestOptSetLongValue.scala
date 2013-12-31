package com.dslplatform.ocd.values

import OptSetLongInValue.OptSetLongValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetLongValue extends SpecExtensions {
  def `Test property field type: Option[Set[Long]]`() =
    checkType(
      typeOf[Option[Set[Long]]]
    , typeOf[OptSetLongValue].member("optSetLong": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetLongValue().optSetLong === None)
  }
}

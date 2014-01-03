package com.dslplatform.ocd.values

import OptSetOptLongInValue.OptSetOptLongValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetOptLongValue extends SpecExtensions {
  def `Test property field type: Option[Set[Option[Long]]]`() =
    checkType(
      typeOf[Option[Set[Option[Long]]]]
    , typeOf[OptSetOptLongValue].member("optSetOptLong": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetOptLongValue().optSetOptLong === None)
  }
}

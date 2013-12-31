package com.dslplatform.ocd.values

import SetLongInValue.SetLongValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetLongValue extends SpecExtensions {
  def `Test property field type: Set[Long]`() =
    checkType(
      typeOf[Set[Long]]
    , typeOf[SetLongValue].member("setLong": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Long]`() {
    assert(SetLongValue().setLong === Set.empty[Long])
  }
}

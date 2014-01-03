package com.dslplatform.ocd.values

import OneLongInValue.OneLongValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneLongValue extends SpecExtensions {
  def `Test property field type: Long`() =
    checkType(
      typeOf[Long]
    , typeOf[OneLongValue].member("oneLong": TermName).asMethod.returnType
    )

  def `Test property default value: 0L`() {
    assert(OneLongValue().oneLong === 0L)
  }
}

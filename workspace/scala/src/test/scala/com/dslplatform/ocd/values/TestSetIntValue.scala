package com.dslplatform.ocd.values

import SetIntInValue.SetIntValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetIntValue extends SpecExtensions {
  def `Test property field type: Set[Int]`() =
    checkType(
      typeOf[Set[Int]]
    , typeOf[SetIntValue].member("setInt": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Int]`() {
    assert(SetIntValue().setInt === Set.empty[Int])
  }
}

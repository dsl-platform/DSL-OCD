package com.dslplatform.ocd.values

import SetOptIntInValue.SetOptIntValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptIntValue extends SpecExtensions {
  def `Test property field type: Set[Option[Int]]`() =
    checkType(
      typeOf[Set[Option[Int]]]
    , typeOf[SetOptIntValue].member("setOptInt": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Option[Int]]`() {
    assert(SetOptIntValue().setOptInt === Set.empty[Option[Int]])
  }
}

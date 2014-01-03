package com.dslplatform.ocd.values

import SetOptLongInValue.SetOptLongValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptLongValue extends SpecExtensions {
  def `Test property field type: Set[Option[Long]]`() =
    checkType(
      typeOf[Set[Option[Long]]]
    , typeOf[SetOptLongValue].member("setOptLong": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Option[Long]]`() {
    assert(SetOptLongValue().setOptLong === Set.empty[Option[Long]])
  }
}

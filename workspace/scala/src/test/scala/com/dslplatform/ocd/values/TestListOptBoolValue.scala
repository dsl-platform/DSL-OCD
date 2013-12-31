package com.dslplatform.ocd.values

import ListOptBoolInValue.ListOptBoolValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptBoolValue extends SpecExtensions {
  def `Test property field type: IndexedSeq[Option[Boolean]]`() =
    checkType(
      typeOf[IndexedSeq[Option[Boolean]]]
    , typeOf[ListOptBoolValue].member("listOptBool": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Option[Boolean]]`() {
    assert(ListOptBoolValue().listOptBool === IndexedSeq.empty[Option[Boolean]])
  }
}

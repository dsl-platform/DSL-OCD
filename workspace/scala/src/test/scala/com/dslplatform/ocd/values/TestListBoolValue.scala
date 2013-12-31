package com.dslplatform.ocd.values

import ListBoolInValue.ListBoolValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListBoolValue extends SpecExtensions {
  def `Test property field type: IndexedSeq[Boolean]`() =
    checkType(
      typeOf[IndexedSeq[Boolean]]
    , typeOf[ListBoolValue].member("listBool": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Boolean]`() {
    assert(ListBoolValue().listBool === IndexedSeq.empty[Boolean])
  }
}

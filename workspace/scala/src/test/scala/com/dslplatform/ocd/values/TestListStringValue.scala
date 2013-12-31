package com.dslplatform.ocd.values

import ListStringInValue.ListStringValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListStringValue extends SpecExtensions {
  def `Test property field type: IndexedSeq[String]`() =
    checkType(
      typeOf[IndexedSeq[String]]
    , typeOf[ListStringValue].member("listString": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[String]`() {
    assert(ListStringValue().listString === IndexedSeq.empty[String])
  }
}

package com.dslplatform.ocd.values

import ListMapInValue.ListMapValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListMapValue extends SpecExtensions {
  def `Test property field type: IndexedSeq[Map[String, String]]`() =
    checkType(
      typeOf[IndexedSeq[Map[String, String]]]
    , typeOf[ListMapValue].member("listMap": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Map[String, String]]`() {
    assert(ListMapValue().listMap === IndexedSeq.empty[Map[String, String]])
  }
}

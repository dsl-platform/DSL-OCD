package com.dslplatform.ocd.values

import ListOptStringInValue.ListOptStringValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptStringValue extends SpecExtensions {
  def `Test property field type: IndexedSeq[Option[String]]`() =
    checkType(
      typeOf[IndexedSeq[Option[String]]]
    , typeOf[ListOptStringValue].member("listOptString": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Option[String]]`() {
    assert(ListOptStringValue().listOptString === IndexedSeq.empty[Option[String]])
  }
}

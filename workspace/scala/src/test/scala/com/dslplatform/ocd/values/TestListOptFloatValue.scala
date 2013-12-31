package com.dslplatform.ocd.values

import ListOptFloatInValue.ListOptFloatValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptFloatValue extends SpecExtensions {
  def `Test property field type: IndexedSeq[Option[Float]]`() =
    checkType(
      typeOf[IndexedSeq[Option[Float]]]
    , typeOf[ListOptFloatValue].member("listOptFloat": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Option[Float]]`() {
    assert(ListOptFloatValue().listOptFloat === IndexedSeq.empty[Option[Float]])
  }
}

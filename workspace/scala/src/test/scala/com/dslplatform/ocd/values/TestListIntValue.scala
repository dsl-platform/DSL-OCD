package com.dslplatform.ocd.values

import ListIntInValue.ListIntValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListIntValue extends SpecExtensions {
  def `Test property field type: IndexedSeq[Int]`() =
    checkType(
      typeOf[IndexedSeq[Int]]
    , typeOf[ListIntValue].member("listInt": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Int]`() {
    assert(ListIntValue().listInt === IndexedSeq.empty[Int])
  }
}

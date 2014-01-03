package com.dslplatform.ocd.values

import ListFloatInValue.ListFloatValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListFloatValue extends SpecExtensions {
  def `Test property field type: IndexedSeq[Float]`() =
    checkType(
      typeOf[IndexedSeq[Float]]
    , typeOf[ListFloatValue].member("listFloat": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Float]`() {
    assert(ListFloatValue().listFloat === IndexedSeq.empty[Float])
  }
}

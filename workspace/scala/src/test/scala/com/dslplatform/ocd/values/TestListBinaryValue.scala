package com.dslplatform.ocd.values

import ListBinaryInValue.ListBinaryValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListBinaryValue extends SpecExtensions {
  def `Test property field type: IndexedSeq[Array[Byte]]`() =
    checkType(
      typeOf[IndexedSeq[Array[Byte]]]
    , typeOf[ListBinaryValue].member("listBinary": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Array[Byte]]`() {
    assert(ListBinaryValue().listBinary === IndexedSeq.empty[Array[Byte]])
  }
}

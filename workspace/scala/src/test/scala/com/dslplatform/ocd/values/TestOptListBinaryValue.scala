package com.dslplatform.ocd.values

import OptListBinaryInValue.OptListBinaryValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListBinaryValue extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[Array[Byte]]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Array[Byte]]]]
    , typeOf[OptListBinaryValue].member("optListBinary": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListBinaryValue().optListBinary === None)
  }
}

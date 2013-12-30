package com.dslplatform.ocd.values

import ListBinaryInValue.ListBinaryValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListBinaryValue extends SpecExtensions {
  def `Check single property type via reflection: IndexedSeq[Array[Byte]]`() =
    checkType(
      typeOf[IndexedSeq[Array[Byte]]]
    , typeOf[ListBinaryValue].member("listBinary": TermName).asMethod.returnType
    )
}

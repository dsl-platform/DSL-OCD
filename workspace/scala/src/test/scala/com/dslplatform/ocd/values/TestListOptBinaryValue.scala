package com.dslplatform.ocd.values

import ListOptBinaryInValue.ListOptBinaryValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptBinaryValue extends SpecExtensions {
  def `Check single property type via reflection: IndexedSeq[Option[Array[Byte]]]`() =
    checkType(
      typeOf[IndexedSeq[Option[Array[Byte]]]]
    , typeOf[ListOptBinaryValue].member("listOptBinary": TermName).asMethod.returnType
    )
}

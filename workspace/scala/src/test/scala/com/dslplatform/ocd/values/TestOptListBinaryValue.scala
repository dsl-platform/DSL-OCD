package com.dslplatform.ocd.values

import OptListBinaryInValue.OptListBinaryValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListBinaryValue extends SpecExtensions {
  def `Check single property type via reflection: Option[IndexedSeq[Array[Byte]]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Array[Byte]]]]
    , typeOf[OptListBinaryValue].member("optListBinary": TermName).asMethod.returnType
    )
}

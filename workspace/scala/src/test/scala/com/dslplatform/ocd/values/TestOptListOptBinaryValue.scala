package com.dslplatform.ocd.values

import OptListOptBinaryInValue.OptListOptBinaryValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListOptBinaryValue extends SpecExtensions {
  def `Check single property type via reflection: Option[IndexedSeq[Option[Array[Byte]]]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Option[Array[Byte]]]]]
    , typeOf[OptListOptBinaryValue].member("optListOptBinary": TermName).asMethod.returnType
    )
}

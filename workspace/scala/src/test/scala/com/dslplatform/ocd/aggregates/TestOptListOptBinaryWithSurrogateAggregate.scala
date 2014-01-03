package com.dslplatform.ocd.aggregates

import OptListOptBinaryWithSurrogateInAggregate.OptListOptBinaryWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListOptBinaryWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[Option[Array[Byte]]]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Option[Array[Byte]]]]]
    , typeOf[OptListOptBinaryWithSurrogateAggregate].member("optListOptBinary": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListOptBinaryWithSurrogateAggregate().optListOptBinary === None)
  }
}

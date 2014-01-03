package com.dslplatform.ocd.aggregates

import OptListBinaryWithSurrogateInAggregate.OptListBinaryWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListBinaryWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[Array[Byte]]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Array[Byte]]]]
    , typeOf[OptListBinaryWithSurrogateAggregate].member("optListBinary": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListBinaryWithSurrogateAggregate().optListBinary === None)
  }
}

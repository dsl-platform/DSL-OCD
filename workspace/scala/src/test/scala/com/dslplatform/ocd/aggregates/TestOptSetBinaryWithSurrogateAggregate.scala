package com.dslplatform.ocd.aggregates

import OptSetBinaryWithSurrogateInAggregate.OptSetBinaryWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetBinaryWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Set[Array[Byte]]]`() =
    checkType(
      typeOf[Option[Set[Array[Byte]]]]
    , typeOf[OptSetBinaryWithSurrogateAggregate].member("optSetBinary": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetBinaryWithSurrogateAggregate().optSetBinary === None)
  }
}

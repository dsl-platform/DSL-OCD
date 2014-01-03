package com.dslplatform.ocd.aggregates

import OptArrayBinaryWithSurrogateInAggregate.OptArrayBinaryWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayBinaryWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Array[Array[Byte]]]`() =
    checkType(
      typeOf[Option[Array[Array[Byte]]]]
    , typeOf[OptArrayBinaryWithSurrogateAggregate].member("optArrayBinary": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayBinaryWithSurrogateAggregate().optArrayBinary === None)
  }
}

package com.dslplatform.ocd.aggregates

import OptBinaryWithSurrogateInAggregate.OptBinaryWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptBinaryWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Array[Byte]]`() =
    checkType(
      typeOf[Option[Array[Byte]]]
    , typeOf[OptBinaryWithSurrogateAggregate].member("optBinary": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptBinaryWithSurrogateAggregate().optBinary === None)
  }
}

package com.dslplatform.ocd.aggregates

import OptArrayOptBinaryWithSurrogateInAggregate.OptArrayOptBinaryWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayOptBinaryWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Array[Option[Array[Byte]]]]`() =
    checkType(
      typeOf[Option[Array[Option[Array[Byte]]]]]
    , typeOf[OptArrayOptBinaryWithSurrogateAggregate].member("optArrayOptBinary": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayOptBinaryWithSurrogateAggregate().optArrayOptBinary === None)
  }
}

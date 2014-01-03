package com.dslplatform.ocd.aggregates

import OptSetOptBinaryWithSurrogateInAggregate.OptSetOptBinaryWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetOptBinaryWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Set[Option[Array[Byte]]]]`() =
    checkType(
      typeOf[Option[Set[Option[Array[Byte]]]]]
    , typeOf[OptSetOptBinaryWithSurrogateAggregate].member("optSetOptBinary": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetOptBinaryWithSurrogateAggregate().optSetOptBinary === None)
  }
}

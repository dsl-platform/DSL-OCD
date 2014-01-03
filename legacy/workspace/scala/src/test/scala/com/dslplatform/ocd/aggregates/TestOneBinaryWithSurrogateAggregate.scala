package com.dslplatform.ocd.aggregates

import OneBinaryWithSurrogateInAggregate.OneBinaryWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneBinaryWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Array[Byte]`() =
    checkType(
      typeOf[Array[Byte]]
    , typeOf[OneBinaryWithSurrogateAggregate].member("oneBinary": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Byte]`() {
    assert(OneBinaryWithSurrogateAggregate().oneBinary === Array.empty[Byte])
  }
}

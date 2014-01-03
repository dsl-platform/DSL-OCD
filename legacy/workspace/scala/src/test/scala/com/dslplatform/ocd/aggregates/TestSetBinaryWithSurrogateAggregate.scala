package com.dslplatform.ocd.aggregates

import SetBinaryWithSurrogateInAggregate.SetBinaryWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetBinaryWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Set[Array[Byte]]`() =
    checkType(
      typeOf[Set[Array[Byte]]]
    , typeOf[SetBinaryWithSurrogateAggregate].member("setBinary": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Array[Byte]]`() {
    assert(SetBinaryWithSurrogateAggregate().setBinary === Set.empty[Array[Byte]])
  }
}

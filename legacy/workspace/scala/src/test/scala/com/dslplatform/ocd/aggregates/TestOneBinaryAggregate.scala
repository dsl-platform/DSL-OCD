package com.dslplatform.ocd.aggregates

import OneBinaryInAggregate.OneBinaryAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneBinaryAggregate extends SpecExtensions {
  def `Test property field type: Array[Byte]`() =
    checkType(
      typeOf[Array[Byte]]
    , typeOf[OneBinaryAggregate].member("oneBinary": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Byte]`() {
    assert(OneBinaryAggregate().oneBinary === Array.empty[Byte])
  }
}

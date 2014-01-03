package com.dslplatform.ocd.aggregates

import SetOptBinaryInAggregate.SetOptBinaryAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptBinaryAggregate extends SpecExtensions {
  def `Test property field type: Set[Option[Array[Byte]]]`() =
    checkType(
      typeOf[Set[Option[Array[Byte]]]]
    , typeOf[SetOptBinaryAggregate].member("setOptBinary": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Option[Array[Byte]]]`() {
    assert(SetOptBinaryAggregate().setOptBinary === Set.empty[Option[Array[Byte]]])
  }
}

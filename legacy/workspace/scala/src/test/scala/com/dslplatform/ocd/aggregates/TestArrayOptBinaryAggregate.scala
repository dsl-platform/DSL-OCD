package com.dslplatform.ocd.aggregates

import ArrayOptBinaryInAggregate.ArrayOptBinaryAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptBinaryAggregate extends SpecExtensions {
  def `Test property field type: Array[Option[Array[Byte]]]`() =
    checkType(
      typeOf[Array[Option[Array[Byte]]]]
    , typeOf[ArrayOptBinaryAggregate].member("arrayOptBinary": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Option[Array[Byte]]]`() {
    assert(ArrayOptBinaryAggregate().arrayOptBinary === Array.empty[Option[Array[Byte]]])
  }
}

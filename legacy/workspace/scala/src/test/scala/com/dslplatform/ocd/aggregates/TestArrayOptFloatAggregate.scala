package com.dslplatform.ocd.aggregates

import ArrayOptFloatInAggregate.ArrayOptFloatAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptFloatAggregate extends SpecExtensions {
  def `Test property field type: Array[Option[Float]]`() =
    checkType(
      typeOf[Array[Option[Float]]]
    , typeOf[ArrayOptFloatAggregate].member("arrayOptFloat": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Option[Float]]`() {
    assert(ArrayOptFloatAggregate().arrayOptFloat === Array.empty[Option[Float]])
  }
}

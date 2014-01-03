package com.dslplatform.ocd.aggregates

import ArrayIntInAggregate.ArrayIntAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayIntAggregate extends SpecExtensions {
  def `Test property field type: Array[Int]`() =
    checkType(
      typeOf[Array[Int]]
    , typeOf[ArrayIntAggregate].member("arrayInt": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Int]`() {
    assert(ArrayIntAggregate().arrayInt === Array.empty[Int])
  }
}

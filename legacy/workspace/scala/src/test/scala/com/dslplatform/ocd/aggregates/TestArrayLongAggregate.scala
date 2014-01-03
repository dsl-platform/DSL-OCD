package com.dslplatform.ocd.aggregates

import ArrayLongInAggregate.ArrayLongAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayLongAggregate extends SpecExtensions {
  def `Test property field type: Array[Long]`() =
    checkType(
      typeOf[Array[Long]]
    , typeOf[ArrayLongAggregate].member("arrayLong": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Long]`() {
    assert(ArrayLongAggregate().arrayLong === Array.empty[Long])
  }
}

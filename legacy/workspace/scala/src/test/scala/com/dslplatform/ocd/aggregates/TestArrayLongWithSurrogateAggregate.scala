package com.dslplatform.ocd.aggregates

import ArrayLongWithSurrogateInAggregate.ArrayLongWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayLongWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Array[Long]`() =
    checkType(
      typeOf[Array[Long]]
    , typeOf[ArrayLongWithSurrogateAggregate].member("arrayLong": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Long]`() {
    assert(ArrayLongWithSurrogateAggregate().arrayLong === Array.empty[Long])
  }
}

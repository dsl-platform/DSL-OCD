package com.dslplatform.ocd.aggregates

import ArrayIntWithSurrogateInAggregate.ArrayIntWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayIntWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Array[Int]`() =
    checkType(
      typeOf[Array[Int]]
    , typeOf[ArrayIntWithSurrogateAggregate].member("arrayInt": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Int]`() {
    assert(ArrayIntWithSurrogateAggregate().arrayInt === Array.empty[Int])
  }
}

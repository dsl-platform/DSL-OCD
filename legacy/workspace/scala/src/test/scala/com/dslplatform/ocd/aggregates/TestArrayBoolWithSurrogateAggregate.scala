package com.dslplatform.ocd.aggregates

import ArrayBoolWithSurrogateInAggregate.ArrayBoolWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayBoolWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Array[Boolean]`() =
    checkType(
      typeOf[Array[Boolean]]
    , typeOf[ArrayBoolWithSurrogateAggregate].member("arrayBool": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Boolean]`() {
    assert(ArrayBoolWithSurrogateAggregate().arrayBool === Array.empty[Boolean])
  }
}

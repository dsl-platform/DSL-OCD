package com.dslplatform.ocd.aggregates

import ArrayBoolInAggregate.ArrayBoolAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayBoolAggregate extends SpecExtensions {
  def `Test property field type: Array[Boolean]`() =
    checkType(
      typeOf[Array[Boolean]]
    , typeOf[ArrayBoolAggregate].member("arrayBool": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Boolean]`() {
    assert(ArrayBoolAggregate().arrayBool === Array.empty[Boolean])
  }
}

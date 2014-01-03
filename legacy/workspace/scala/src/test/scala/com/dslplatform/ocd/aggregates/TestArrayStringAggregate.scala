package com.dslplatform.ocd.aggregates

import ArrayStringInAggregate.ArrayStringAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayStringAggregate extends SpecExtensions {
  def `Test property field type: Array[String]`() =
    checkType(
      typeOf[Array[String]]
    , typeOf[ArrayStringAggregate].member("arrayString": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[String]`() {
    assert(ArrayStringAggregate().arrayString === Array.empty[String])
  }
}

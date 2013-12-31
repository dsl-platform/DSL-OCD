package com.dslplatform.ocd.aggregates

import ArrayDecimalInAggregate.ArrayDecimalAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayDecimalAggregate extends SpecExtensions {
  def `Test property field type: Array[BigDecimal]`() =
    checkType(
      typeOf[Array[BigDecimal]]
    , typeOf[ArrayDecimalAggregate].member("arrayDecimal": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[BigDecimal]`() {
    assert(ArrayDecimalAggregate().arrayDecimal === Array.empty[BigDecimal])
  }
}

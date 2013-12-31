package com.dslplatform.ocd.aggregates

import ArrayMoneyInAggregate.ArrayMoneyAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayMoneyAggregate extends SpecExtensions {
  def `Test property field type: Array[BigDecimal]`() =
    checkType(
      typeOf[Array[BigDecimal]]
    , typeOf[ArrayMoneyAggregate].member("arrayMoney": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[BigDecimal]`() {
    assert(ArrayMoneyAggregate().arrayMoney === Array.empty[BigDecimal])
  }
}

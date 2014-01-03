package com.dslplatform.ocd.aggregates

import ArrayMoneyWithSurrogateInAggregate.ArrayMoneyWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayMoneyWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Array[BigDecimal]`() =
    checkType(
      typeOf[Array[BigDecimal]]
    , typeOf[ArrayMoneyWithSurrogateAggregate].member("arrayMoney": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[BigDecimal]`() {
    assert(ArrayMoneyWithSurrogateAggregate().arrayMoney === Array.empty[BigDecimal])
  }
}

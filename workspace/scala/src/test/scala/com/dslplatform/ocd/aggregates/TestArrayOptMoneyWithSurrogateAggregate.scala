package com.dslplatform.ocd.aggregates

import ArrayOptMoneyWithSurrogateInAggregate.ArrayOptMoneyWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptMoneyWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Array[Option[BigDecimal]]`() =
    checkType(
      typeOf[Array[Option[BigDecimal]]]
    , typeOf[ArrayOptMoneyWithSurrogateAggregate].member("arrayOptMoney": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Option[BigDecimal]]`() {
    assert(ArrayOptMoneyWithSurrogateAggregate().arrayOptMoney === Array.empty[Option[BigDecimal]])
  }
}

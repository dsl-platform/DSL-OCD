package com.dslplatform.ocd.aggregates

import ArrayOptMoneyInAggregate.ArrayOptMoneyAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptMoneyAggregate extends SpecExtensions {
  def `Test property field type: Array[Option[BigDecimal]]`() =
    checkType(
      typeOf[Array[Option[BigDecimal]]]
    , typeOf[ArrayOptMoneyAggregate].member("arrayOptMoney": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Option[BigDecimal]]`() {
    assert(ArrayOptMoneyAggregate().arrayOptMoney === Array.empty[Option[BigDecimal]])
  }
}

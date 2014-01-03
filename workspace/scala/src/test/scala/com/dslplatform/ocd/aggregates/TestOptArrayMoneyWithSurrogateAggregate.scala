package com.dslplatform.ocd.aggregates

import OptArrayMoneyWithSurrogateInAggregate.OptArrayMoneyWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayMoneyWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Array[BigDecimal]]`() =
    checkType(
      typeOf[Option[Array[BigDecimal]]]
    , typeOf[OptArrayMoneyWithSurrogateAggregate].member("optArrayMoney": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayMoneyWithSurrogateAggregate().optArrayMoney === None)
  }
}

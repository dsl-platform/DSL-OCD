package com.dslplatform.ocd.aggregates

import OptArrayOptMoneyWithSurrogateInAggregate.OptArrayOptMoneyWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayOptMoneyWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Array[Option[BigDecimal]]]`() =
    checkType(
      typeOf[Option[Array[Option[BigDecimal]]]]
    , typeOf[OptArrayOptMoneyWithSurrogateAggregate].member("optArrayOptMoney": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayOptMoneyWithSurrogateAggregate().optArrayOptMoney === None)
  }
}

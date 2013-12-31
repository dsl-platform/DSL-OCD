package com.dslplatform.ocd.aggregates

import SetOptDecimalInAggregate.SetOptDecimalAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptDecimalAggregate extends SpecExtensions {
  def `Test property field type: Set[Option[BigDecimal]]`() =
    checkType(
      typeOf[Set[Option[BigDecimal]]]
    , typeOf[SetOptDecimalAggregate].member("setOptDecimal": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Option[BigDecimal]]`() {
    assert(SetOptDecimalAggregate().setOptDecimal === Set.empty[Option[BigDecimal]])
  }
}

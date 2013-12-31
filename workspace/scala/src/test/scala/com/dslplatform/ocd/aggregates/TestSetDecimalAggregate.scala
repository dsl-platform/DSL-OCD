package com.dslplatform.ocd.aggregates

import SetDecimalInAggregate.SetDecimalAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetDecimalAggregate extends SpecExtensions {
  def `Test property field type: Set[BigDecimal]`() =
    checkType(
      typeOf[Set[BigDecimal]]
    , typeOf[SetDecimalAggregate].member("setDecimal": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[BigDecimal]`() {
    assert(SetDecimalAggregate().setDecimal === Set.empty[BigDecimal])
  }
}

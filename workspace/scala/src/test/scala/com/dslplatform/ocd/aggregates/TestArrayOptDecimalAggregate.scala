package com.dslplatform.ocd.aggregates

import ArrayOptDecimalInAggregate.ArrayOptDecimalAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptDecimalAggregate extends SpecExtensions {
  def `Test property field type: Array[Option[BigDecimal]]`() =
    checkType(
      typeOf[Array[Option[BigDecimal]]]
    , typeOf[ArrayOptDecimalAggregate].member("arrayOptDecimal": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Option[BigDecimal]]`() {
    assert(ArrayOptDecimalAggregate().arrayOptDecimal === Array.empty[Option[BigDecimal]])
  }
}

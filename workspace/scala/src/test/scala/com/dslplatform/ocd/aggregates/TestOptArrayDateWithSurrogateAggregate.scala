package com.dslplatform.ocd.aggregates

import OptArrayDateWithSurrogateInAggregate.OptArrayDateWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayDateWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Array[org.joda.time.LocalDate]]`() =
    checkType(
      typeOf[Option[Array[org.joda.time.LocalDate]]]
    , typeOf[OptArrayDateWithSurrogateAggregate].member("optArrayDate": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayDateWithSurrogateAggregate().optArrayDate === None)
  }
}

package com.dslplatform.ocd.aggregates

import OptArrayOptDateWithSurrogateInAggregate.OptArrayOptDateWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayOptDateWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Array[Option[org.joda.time.LocalDate]]]`() =
    checkType(
      typeOf[Option[Array[Option[org.joda.time.LocalDate]]]]
    , typeOf[OptArrayOptDateWithSurrogateAggregate].member("optArrayOptDate": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayOptDateWithSurrogateAggregate().optArrayOptDate === None)
  }
}

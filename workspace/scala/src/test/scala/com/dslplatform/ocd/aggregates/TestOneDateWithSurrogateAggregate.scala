package com.dslplatform.ocd.aggregates

import OneDateWithSurrogateInAggregate.OneDateWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneDateWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: org.joda.time.LocalDate`() =
    checkType(
      typeOf[org.joda.time.LocalDate]
    , typeOf[OneDateWithSurrogateAggregate].member("oneDate": TermName).asMethod.returnType
    )

  def `Test property default value: org.joda.time.LocalDate.now`() {
    assert(OneDateWithSurrogateAggregate().oneDate === org.joda.time.LocalDate.now)
  }
}

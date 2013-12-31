package com.dslplatform.ocd.aggregates

import OneDateInAggregate.OneDateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneDateAggregate extends SpecExtensions {
  def `Test property field type: org.joda.time.LocalDate`() =
    checkType(
      typeOf[org.joda.time.LocalDate]
    , typeOf[OneDateAggregate].member("oneDate": TermName).asMethod.returnType
    )

  def `Test property default value: org.joda.time.LocalDate.now`() {
    assert(OneDateAggregate().oneDate === org.joda.time.LocalDate.now)
  }
}

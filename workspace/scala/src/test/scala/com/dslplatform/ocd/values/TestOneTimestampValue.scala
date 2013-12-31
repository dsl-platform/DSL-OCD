package com.dslplatform.ocd.values

import OneTimestampInValue.OneTimestampValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneTimestampValue extends SpecExtensions {
  def `Test property field type: org.joda.time.DateTime`() =
    checkType(
      typeOf[org.joda.time.DateTime]
    , typeOf[OneTimestampValue].member("oneTimestamp": TermName).asMethod.returnType
    )

  def `Test property default value: org.joda.time.DateTime.now`() {
    assert(OneTimestampValue().oneTimestamp.getClass == classOf[org.joda.time.DateTime]);
  }
}

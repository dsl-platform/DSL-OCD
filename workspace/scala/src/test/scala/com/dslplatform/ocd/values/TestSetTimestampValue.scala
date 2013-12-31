package com.dslplatform.ocd.values

import SetTimestampInValue.SetTimestampValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetTimestampValue extends SpecExtensions {
  def `Test property field type: Set[org.joda.time.DateTime]`() =
    checkType(
      typeOf[Set[org.joda.time.DateTime]]
    , typeOf[SetTimestampValue].member("setTimestamp": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[org.joda.time.DateTime]`() {
    assert(SetTimestampValue().setTimestamp === Set.empty[org.joda.time.DateTime])
  }
}

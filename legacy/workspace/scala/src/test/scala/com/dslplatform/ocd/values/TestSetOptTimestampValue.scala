package com.dslplatform.ocd.values

import SetOptTimestampInValue.SetOptTimestampValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptTimestampValue extends SpecExtensions {
  def `Test property field type: Set[Option[org.joda.time.DateTime]]`() =
    checkType(
      typeOf[Set[Option[org.joda.time.DateTime]]]
    , typeOf[SetOptTimestampValue].member("setOptTimestamp": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Option[org.joda.time.DateTime]]`() {
    assert(SetOptTimestampValue().setOptTimestamp === Set.empty[Option[org.joda.time.DateTime]])
  }
}

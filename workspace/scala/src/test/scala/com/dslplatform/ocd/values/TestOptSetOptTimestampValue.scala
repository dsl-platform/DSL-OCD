package com.dslplatform.ocd.values

import OptSetOptTimestampInValue.OptSetOptTimestampValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetOptTimestampValue extends SpecExtensions {
  def `Test property field type: Option[Set[Option[org.joda.time.DateTime]]]`() =
    checkType(
      typeOf[Option[Set[Option[org.joda.time.DateTime]]]]
    , typeOf[OptSetOptTimestampValue].member("optSetOptTimestamp": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetOptTimestampValue().optSetOptTimestamp === None)
  }
}

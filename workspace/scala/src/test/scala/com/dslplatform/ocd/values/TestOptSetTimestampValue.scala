package com.dslplatform.ocd.values

import OptSetTimestampInValue.OptSetTimestampValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetTimestampValue extends SpecExtensions {
  def `Test property field type: Option[Set[org.joda.time.DateTime]]`() =
    checkType(
      typeOf[Option[Set[org.joda.time.DateTime]]]
    , typeOf[OptSetTimestampValue].member("optSetTimestamp": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetTimestampValue().optSetTimestamp === None)
  }
}

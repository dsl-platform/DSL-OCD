package com.dslplatform.ocd.values

import OptTimestampInValue.OptTimestampValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptTimestampValue extends SpecExtensions {
  def `Test property field type: Option[org.joda.time.DateTime]`() =
    checkType(
      typeOf[Option[org.joda.time.DateTime]]
    , typeOf[OptTimestampValue].member("optTimestamp": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptTimestampValue().optTimestamp === None)
  }
}

package com.dslplatform.ocd.values

import ArrayOptTimestampInValue.ArrayOptTimestampValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptTimestampValue extends SpecExtensions {
  def `Test property field type: Array[Option[org.joda.time.DateTime]]`() =
    checkType(
      typeOf[Array[Option[org.joda.time.DateTime]]]
    , typeOf[ArrayOptTimestampValue].member("arrayOptTimestamp": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Option[org.joda.time.DateTime]]`() {
    assert(ArrayOptTimestampValue().arrayOptTimestamp === Array.empty[Option[org.joda.time.DateTime]])
  }
}

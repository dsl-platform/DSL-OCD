package com.dslplatform.ocd.values

import ArrayTimestampInValue.ArrayTimestampValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayTimestampValue extends SpecExtensions {
  def `Test property field type: Array[org.joda.time.DateTime]`() =
    checkType(
      typeOf[Array[org.joda.time.DateTime]]
    , typeOf[ArrayTimestampValue].member("arrayTimestamp": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[org.joda.time.DateTime]`() {
    assert(ArrayTimestampValue().arrayTimestamp === Array.empty[org.joda.time.DateTime])
  }
}

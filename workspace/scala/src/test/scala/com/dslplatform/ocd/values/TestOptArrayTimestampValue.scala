package com.dslplatform.ocd.values

import OptArrayTimestampInValue.OptArrayTimestampValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayTimestampValue extends SpecExtensions {
  def `Test property field type: Option[Array[org.joda.time.DateTime]]`() =
    checkType(
      typeOf[Option[Array[org.joda.time.DateTime]]]
    , typeOf[OptArrayTimestampValue].member("optArrayTimestamp": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayTimestampValue().optArrayTimestamp === None)
  }
}

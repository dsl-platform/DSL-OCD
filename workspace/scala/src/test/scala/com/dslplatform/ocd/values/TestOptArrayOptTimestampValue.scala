package com.dslplatform.ocd.values

import OptArrayOptTimestampInValue.OptArrayOptTimestampValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayOptTimestampValue extends SpecExtensions {
  def `Test property field type: Option[Array[Option[org.joda.time.DateTime]]]`() =
    checkType(
      typeOf[Option[Array[Option[org.joda.time.DateTime]]]]
    , typeOf[OptArrayOptTimestampValue].member("optArrayOptTimestamp": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayOptTimestampValue().optArrayOptTimestamp === None)
  }
}

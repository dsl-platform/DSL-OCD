package com.dslplatform.ocd.values

import ListOptTimestampInValue.ListOptTimestampValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptTimestampValue extends SpecExtensions {
  def `Test property field type: IndexedSeq[Option[org.joda.time.DateTime]]`() =
    checkType(
      typeOf[IndexedSeq[Option[org.joda.time.DateTime]]]
    , typeOf[ListOptTimestampValue].member("listOptTimestamp": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Option[org.joda.time.DateTime]]`() {
    assert(ListOptTimestampValue().listOptTimestamp === IndexedSeq.empty[Option[org.joda.time.DateTime]])
  }
}

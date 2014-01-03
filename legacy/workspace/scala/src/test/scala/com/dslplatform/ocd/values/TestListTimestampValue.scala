package com.dslplatform.ocd.values

import ListTimestampInValue.ListTimestampValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListTimestampValue extends SpecExtensions {
  def `Test property field type: IndexedSeq[org.joda.time.DateTime]`() =
    checkType(
      typeOf[IndexedSeq[org.joda.time.DateTime]]
    , typeOf[ListTimestampValue].member("listTimestamp": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[org.joda.time.DateTime]`() {
    assert(ListTimestampValue().listTimestamp === IndexedSeq.empty[org.joda.time.DateTime])
  }
}

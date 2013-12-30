package com.dslplatform.ocd.values

import ListOptTimestampInValue.ListOptTimestampValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptTimestampValue extends SpecExtensions {
  def `Check single property type via reflection: IndexedSeq[Option[org.joda.time.DateTime]]`() =
    checkType(
      typeOf[IndexedSeq[Option[org.joda.time.DateTime]]]
    , typeOf[ListOptTimestampValue].member("listOptTimestamp": TermName).asMethod.returnType
    )
}

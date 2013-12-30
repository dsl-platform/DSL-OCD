package com.dslplatform.ocd.values

import OptListOptTimestampInValue.OptListOptTimestampValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListOptTimestampValue extends SpecExtensions {
  def `Check single property type via reflection: Option[IndexedSeq[Option[org.joda.time.DateTime]]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Option[org.joda.time.DateTime]]]]
    , typeOf[OptListOptTimestampValue].member("optListOptTimestamp": TermName).asMethod.returnType
    )
}

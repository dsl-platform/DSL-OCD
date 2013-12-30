package com.dslplatform.ocd.values

import OptListTimestampInValue.OptListTimestampValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListTimestampValue extends SpecExtensions {
  def `Check single property type via reflection: Option[IndexedSeq[org.joda.time.DateTime]]`() =
    checkType(
      typeOf[Option[IndexedSeq[org.joda.time.DateTime]]]
    , typeOf[OptListTimestampValue].member("optListTimestamp": TermName).asMethod.returnType
    )
}

package com.dslplatform.ocd.values

import OptSetOptTimestampInValue.OptSetOptTimestampValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetOptTimestampValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Set[Option[org.joda.time.DateTime]]]`() =
    checkType(
      typeOf[Option[Set[Option[org.joda.time.DateTime]]]]
    , typeOf[OptSetOptTimestampValue].member("optSetOptTimestamp": TermName).asMethod.returnType
    )
}

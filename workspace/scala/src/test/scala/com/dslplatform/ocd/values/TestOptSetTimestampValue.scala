package com.dslplatform.ocd.values

import OptSetTimestampInValue.OptSetTimestampValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetTimestampValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Set[org.joda.time.DateTime]]`() =
    checkType(
      typeOf[Option[Set[org.joda.time.DateTime]]]
    , typeOf[OptSetTimestampValue].member("optSetTimestamp": TermName).asMethod.returnType
    )
}

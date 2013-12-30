package com.dslplatform.ocd.values

import SetOptTimestampInValue.SetOptTimestampValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptTimestampValue extends SpecExtensions {
  def `Check single property type via reflection: Set[Option[org.joda.time.DateTime]]`() =
    checkType(
      typeOf[Set[Option[org.joda.time.DateTime]]]
    , typeOf[SetOptTimestampValue].member("setOptTimestamp": TermName).asMethod.returnType
    )
}

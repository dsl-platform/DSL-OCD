package com.dslplatform.ocd.values

import ArrayOptTimestampInValue.ArrayOptTimestampValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptTimestampValue extends SpecExtensions {
  def `Check single property type via reflection: Array[Option[org.joda.time.DateTime]]`() =
    checkType(
      typeOf[Array[Option[org.joda.time.DateTime]]]
    , typeOf[ArrayOptTimestampValue].member("arrayOptTimestamp": TermName).asMethod.returnType
    )
}

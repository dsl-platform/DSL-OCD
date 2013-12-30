package com.dslplatform.ocd.values

import OptArrayOptTimestampInValue.OptArrayOptTimestampValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayOptTimestampValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Array[Option[org.joda.time.DateTime]]]`() =
    checkType(
      typeOf[Option[Array[Option[org.joda.time.DateTime]]]]
    , typeOf[OptArrayOptTimestampValue].member("optArrayOptTimestamp": TermName).asMethod.returnType
    )
}

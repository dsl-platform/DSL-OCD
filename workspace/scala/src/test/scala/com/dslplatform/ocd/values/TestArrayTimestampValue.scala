package com.dslplatform.ocd.values

import ArrayTimestampInValue.ArrayTimestampValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayTimestampValue extends SpecExtensions {
  def `Check single property type via reflection: Array[org.joda.time.DateTime]`() =
    checkType(
      typeOf[Array[org.joda.time.DateTime]]
    , typeOf[ArrayTimestampValue].member("arrayTimestamp": TermName).asMethod.returnType
    )
}

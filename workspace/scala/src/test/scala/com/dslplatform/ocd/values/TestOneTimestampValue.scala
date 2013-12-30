package com.dslplatform.ocd.values

import OneTimestampInValue.OneTimestampValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneTimestampValue extends SpecExtensions {
  def `Check single property type via reflection: org.joda.time.DateTime`() =
    checkType(
      typeOf[org.joda.time.DateTime]
    , typeOf[OneTimestampValue].member("oneTimestamp": TermName).asMethod.returnType
    )
}

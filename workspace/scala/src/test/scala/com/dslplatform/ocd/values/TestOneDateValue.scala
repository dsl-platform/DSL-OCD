package com.dslplatform.ocd.values

import OneDateInValue.OneDateValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneDateValue extends SpecExtensions {
  def `Check single property type via reflection: org.joda.time.LocalDate`() =
    checkType(
      typeOf[org.joda.time.LocalDate]
    , typeOf[OneDateValue].member("oneDate": TermName).asMethod.returnType
    )
}

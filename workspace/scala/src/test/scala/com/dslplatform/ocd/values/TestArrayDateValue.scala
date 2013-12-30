package com.dslplatform.ocd.values

import ArrayDateInValue.ArrayDateValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayDateValue extends SpecExtensions {
  def `Check single property type via reflection: Array[org.joda.time.LocalDate]`() =
    checkType(
      typeOf[Array[org.joda.time.LocalDate]]
    , typeOf[ArrayDateValue].member("arrayDate": TermName).asMethod.returnType
    )
}

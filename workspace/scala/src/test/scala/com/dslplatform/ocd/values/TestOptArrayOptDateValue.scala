package com.dslplatform.ocd.values

import OptArrayOptDateInValue.OptArrayOptDateValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayOptDateValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Array[Option[org.joda.time.LocalDate]]]`() =
    checkType(
      typeOf[Option[Array[Option[org.joda.time.LocalDate]]]]
    , typeOf[OptArrayOptDateValue].member("optArrayOptDate": TermName).asMethod.returnType
    )
}

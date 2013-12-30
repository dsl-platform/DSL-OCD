package com.dslplatform.ocd.values

import OptSetLongInValue.OptSetLongValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetLongValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Set[Long]]`() =
    checkType(
      typeOf[Option[Set[Long]]]
    , typeOf[OptSetLongValue].member("optSetLong": TermName).asMethod.returnType
    )
}

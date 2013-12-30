package com.dslplatform.ocd.values

import OptLongInValue.OptLongValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptLongValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Long]`() =
    checkType(
      typeOf[Option[Long]]
    , typeOf[OptLongValue].member("optLong": TermName).asMethod.returnType
    )
}

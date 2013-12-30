package com.dslplatform.ocd.values

import OneLongInValue.OneLongValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneLongValue extends SpecExtensions {
  def `Check single property type via reflection: Long`() =
    checkType(
      typeOf[Long]
    , typeOf[OneLongValue].member("oneLong": TermName).asMethod.returnType
    )
}

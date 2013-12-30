package com.dslplatform.ocd.values

import ArrayLongInValue.ArrayLongValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayLongValue extends SpecExtensions {
  def `Check single property type via reflection: Array[Long]`() =
    checkType(
      typeOf[Array[Long]]
    , typeOf[ArrayLongValue].member("arrayLong": TermName).asMethod.returnType
    )
}

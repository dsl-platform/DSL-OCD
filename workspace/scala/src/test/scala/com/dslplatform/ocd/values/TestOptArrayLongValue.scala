package com.dslplatform.ocd.values

import OptArrayLongInValue.OptArrayLongValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayLongValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Array[Long]]`() =
    checkType(
      typeOf[Option[Array[Long]]]
    , typeOf[OptArrayLongValue].member("optArrayLong": TermName).asMethod.returnType
    )
}

package com.dslplatform.ocd.values

import ArrayOptLongInValue.ArrayOptLongValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptLongValue extends SpecExtensions {
  def `Check single property type via reflection: Array[Option[Long]]`() =
    checkType(
      typeOf[Array[Option[Long]]]
    , typeOf[ArrayOptLongValue].member("arrayOptLong": TermName).asMethod.returnType
    )
}

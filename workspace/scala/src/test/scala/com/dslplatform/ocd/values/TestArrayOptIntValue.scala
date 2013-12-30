package com.dslplatform.ocd.values

import ArrayOptIntInValue.ArrayOptIntValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptIntValue extends SpecExtensions {
  def `Check single property type via reflection: Array[Option[Int]]`() =
    checkType(
      typeOf[Array[Option[Int]]]
    , typeOf[ArrayOptIntValue].member("arrayOptInt": TermName).asMethod.returnType
    )
}

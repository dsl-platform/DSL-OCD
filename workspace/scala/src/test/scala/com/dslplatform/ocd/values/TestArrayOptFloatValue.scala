package com.dslplatform.ocd.values

import ArrayOptFloatInValue.ArrayOptFloatValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptFloatValue extends SpecExtensions {
  def `Check single property type via reflection: Array[Option[Float]]`() =
    checkType(
      typeOf[Array[Option[Float]]]
    , typeOf[ArrayOptFloatValue].member("arrayOptFloat": TermName).asMethod.returnType
    )
}

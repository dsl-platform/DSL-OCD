package com.dslplatform.ocd.values

import OptArrayOptFloatInValue.OptArrayOptFloatValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayOptFloatValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Array[Option[Float]]]`() =
    checkType(
      typeOf[Option[Array[Option[Float]]]]
    , typeOf[OptArrayOptFloatValue].member("optArrayOptFloat": TermName).asMethod.returnType
    )
}

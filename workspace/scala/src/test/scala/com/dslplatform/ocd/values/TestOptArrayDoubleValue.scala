package com.dslplatform.ocd.values

import OptArrayDoubleInValue.OptArrayDoubleValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayDoubleValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Array[Double]]`() =
    checkType(
      typeOf[Option[Array[Double]]]
    , typeOf[OptArrayDoubleValue].member("optArrayDouble": TermName).asMethod.returnType
    )
}

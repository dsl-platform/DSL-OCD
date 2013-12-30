package com.dslplatform.ocd.values

import OptListOptDoubleInValue.OptListOptDoubleValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListOptDoubleValue extends SpecExtensions {
  def `Check single property type via reflection: Option[IndexedSeq[Option[Double]]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Option[Double]]]]
    , typeOf[OptListOptDoubleValue].member("optListOptDouble": TermName).asMethod.returnType
    )
}

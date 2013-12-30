package com.dslplatform.ocd.values

import OptListDoubleInValue.OptListDoubleValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListDoubleValue extends SpecExtensions {
  def `Check single property type via reflection: Option[IndexedSeq[Double]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Double]]]
    , typeOf[OptListDoubleValue].member("optListDouble": TermName).asMethod.returnType
    )
}

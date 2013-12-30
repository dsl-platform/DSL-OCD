package com.dslplatform.ocd.values

import ListDoubleInValue.ListDoubleValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListDoubleValue extends SpecExtensions {
  def `Check single property type via reflection: IndexedSeq[Double]`() =
    checkType(
      typeOf[IndexedSeq[Double]]
    , typeOf[ListDoubleValue].member("listDouble": TermName).asMethod.returnType
    )
}

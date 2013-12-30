package com.dslplatform.ocd.values

import ListFloatInValue.ListFloatValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListFloatValue extends SpecExtensions {
  def `Check single property type via reflection: IndexedSeq[Float]`() =
    checkType(
      typeOf[IndexedSeq[Float]]
    , typeOf[ListFloatValue].member("listFloat": TermName).asMethod.returnType
    )
}

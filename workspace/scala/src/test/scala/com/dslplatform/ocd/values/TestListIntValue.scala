package com.dslplatform.ocd.values

import ListIntInValue.ListIntValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListIntValue extends SpecExtensions {
  def `Check single property type via reflection: IndexedSeq[Int]`() =
    checkType(
      typeOf[IndexedSeq[Int]]
    , typeOf[ListIntValue].member("listInt": TermName).asMethod.returnType
    )
}

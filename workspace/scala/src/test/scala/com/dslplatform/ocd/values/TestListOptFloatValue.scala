package com.dslplatform.ocd.values

import ListOptFloatInValue.ListOptFloatValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptFloatValue extends SpecExtensions {
  def `Check single property type via reflection: IndexedSeq[Option[Float]]`() =
    checkType(
      typeOf[IndexedSeq[Option[Float]]]
    , typeOf[ListOptFloatValue].member("listOptFloat": TermName).asMethod.returnType
    )
}

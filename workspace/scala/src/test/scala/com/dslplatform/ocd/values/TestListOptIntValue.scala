package com.dslplatform.ocd.values

import ListOptIntInValue.ListOptIntValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptIntValue extends SpecExtensions {
  def `Check single property type via reflection: IndexedSeq[Option[Int]]`() =
    checkType(
      typeOf[IndexedSeq[Option[Int]]]
    , typeOf[ListOptIntValue].member("listOptInt": TermName).asMethod.returnType
    )
}

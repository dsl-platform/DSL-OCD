package com.dslplatform.ocd.values

import OptListOptIntInValue.OptListOptIntValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListOptIntValue extends SpecExtensions {
  def `Check single property type via reflection: Option[IndexedSeq[Option[Int]]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Option[Int]]]]
    , typeOf[OptListOptIntValue].member("optListOptInt": TermName).asMethod.returnType
    )
}

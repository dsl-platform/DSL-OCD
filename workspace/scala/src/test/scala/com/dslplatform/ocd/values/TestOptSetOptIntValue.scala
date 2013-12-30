package com.dslplatform.ocd.values

import OptSetOptIntInValue.OptSetOptIntValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetOptIntValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Set[Option[Int]]]`() =
    checkType(
      typeOf[Option[Set[Option[Int]]]]
    , typeOf[OptSetOptIntValue].member("optSetOptInt": TermName).asMethod.returnType
    )
}

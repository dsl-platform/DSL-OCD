package com.dslplatform.ocd.values

import OptIntInValue.OptIntValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptIntValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Int]`() =
    checkType(
      typeOf[Option[Int]]
    , typeOf[OptIntValue].member("optInt": TermName).asMethod.returnType
    )
}

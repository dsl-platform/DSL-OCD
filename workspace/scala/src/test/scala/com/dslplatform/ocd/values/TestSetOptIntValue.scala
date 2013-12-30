package com.dslplatform.ocd.values

import SetOptIntInValue.SetOptIntValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptIntValue extends SpecExtensions {
  def `Check single property type via reflection: Set[Option[Int]]`() =
    checkType(
      typeOf[Set[Option[Int]]]
    , typeOf[SetOptIntValue].member("setOptInt": TermName).asMethod.returnType
    )
}

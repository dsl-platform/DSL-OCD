package com.dslplatform.ocd.values

import SetOptFloatInValue.SetOptFloatValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptFloatValue extends SpecExtensions {
  def `Check single property type via reflection: Set[Option[Float]]`() =
    checkType(
      typeOf[Set[Option[Float]]]
    , typeOf[SetOptFloatValue].member("setOptFloat": TermName).asMethod.returnType
    )
}

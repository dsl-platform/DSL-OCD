package com.dslplatform.ocd.values

import SetUUIDInValue.SetUUIDValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetUUIDValue extends SpecExtensions {
  def `Check single property type via reflection: Set[java.util.UUID]`() =
    checkType(
      typeOf[Set[java.util.UUID]]
    , typeOf[SetUUIDValue].member("setUUID": TermName).asMethod.returnType
    )
}

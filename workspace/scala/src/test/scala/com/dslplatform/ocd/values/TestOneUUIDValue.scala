package com.dslplatform.ocd.values

import OneUUIDInValue.OneUUIDValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneUUIDValue extends SpecExtensions {
  def `Check single property type via reflection: java.util.UUID`() =
    checkType(
      typeOf[java.util.UUID]
    , typeOf[OneUUIDValue].member("oneUUID": TermName).asMethod.returnType
    )
}

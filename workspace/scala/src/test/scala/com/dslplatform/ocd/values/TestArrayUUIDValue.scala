package com.dslplatform.ocd.values

import ArrayUUIDInValue.ArrayUUIDValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayUUIDValue extends SpecExtensions {
  def `Check single property type via reflection: Array[java.util.UUID]`() =
    checkType(
      typeOf[Array[java.util.UUID]]
    , typeOf[ArrayUUIDValue].member("arrayUUID": TermName).asMethod.returnType
    )
}

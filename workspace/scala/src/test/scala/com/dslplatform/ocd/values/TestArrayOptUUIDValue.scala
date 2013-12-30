package com.dslplatform.ocd.values

import ArrayOptUUIDInValue.ArrayOptUUIDValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptUUIDValue extends SpecExtensions {
  def `Check single property type via reflection: Array[Option[java.util.UUID]]`() =
    checkType(
      typeOf[Array[Option[java.util.UUID]]]
    , typeOf[ArrayOptUUIDValue].member("arrayOptUUID": TermName).asMethod.returnType
    )
}

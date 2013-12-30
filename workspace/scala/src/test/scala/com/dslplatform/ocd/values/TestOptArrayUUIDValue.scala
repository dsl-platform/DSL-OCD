package com.dslplatform.ocd.values

import OptArrayUUIDInValue.OptArrayUUIDValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayUUIDValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Array[java.util.UUID]]`() =
    checkType(
      typeOf[Option[Array[java.util.UUID]]]
    , typeOf[OptArrayUUIDValue].member("optArrayUUID": TermName).asMethod.returnType
    )
}

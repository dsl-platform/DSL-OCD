package com.dslplatform.ocd.values

import OptArrayOptUUIDInValue.OptArrayOptUUIDValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayOptUUIDValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Array[Option[java.util.UUID]]]`() =
    checkType(
      typeOf[Option[Array[Option[java.util.UUID]]]]
    , typeOf[OptArrayOptUUIDValue].member("optArrayOptUUID": TermName).asMethod.returnType
    )
}

package com.dslplatform.ocd.values

import OptUUIDInValue.OptUUIDValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptUUIDValue extends SpecExtensions {
  def `Check single property type via reflection: Option[java.util.UUID]`() =
    checkType(
      typeOf[Option[java.util.UUID]]
    , typeOf[OptUUIDValue].member("optUUID": TermName).asMethod.returnType
    )
}

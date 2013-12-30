package com.dslplatform.ocd.values

import OptSetUUIDInValue.OptSetUUIDValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetUUIDValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Set[java.util.UUID]]`() =
    checkType(
      typeOf[Option[Set[java.util.UUID]]]
    , typeOf[OptSetUUIDValue].member("optSetUUID": TermName).asMethod.returnType
    )
}

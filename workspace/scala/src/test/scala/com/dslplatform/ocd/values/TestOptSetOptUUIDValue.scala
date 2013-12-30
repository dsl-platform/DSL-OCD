package com.dslplatform.ocd.values

import OptSetOptUUIDInValue.OptSetOptUUIDValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetOptUUIDValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Set[Option[java.util.UUID]]]`() =
    checkType(
      typeOf[Option[Set[Option[java.util.UUID]]]]
    , typeOf[OptSetOptUUIDValue].member("optSetOptUUID": TermName).asMethod.returnType
    )
}

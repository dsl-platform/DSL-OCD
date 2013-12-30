package com.dslplatform.ocd.values

import OptListOptUUIDInValue.OptListOptUUIDValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListOptUUIDValue extends SpecExtensions {
  def `Check single property type via reflection: Option[IndexedSeq[Option[java.util.UUID]]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Option[java.util.UUID]]]]
    , typeOf[OptListOptUUIDValue].member("optListOptUUID": TermName).asMethod.returnType
    )
}

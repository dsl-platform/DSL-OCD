package com.dslplatform.ocd.values

import ListOptUUIDInValue.ListOptUUIDValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptUUIDValue extends SpecExtensions {
  def `Check single property type via reflection: IndexedSeq[Option[java.util.UUID]]`() =
    checkType(
      typeOf[IndexedSeq[Option[java.util.UUID]]]
    , typeOf[ListOptUUIDValue].member("listOptUUID": TermName).asMethod.returnType
    )
}

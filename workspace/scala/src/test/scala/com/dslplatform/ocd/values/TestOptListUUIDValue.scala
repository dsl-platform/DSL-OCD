package com.dslplatform.ocd.values

import OptListUUIDInValue.OptListUUIDValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListUUIDValue extends SpecExtensions {
  def `Check single property type via reflection: Option[IndexedSeq[java.util.UUID]]`() =
    checkType(
      typeOf[Option[IndexedSeq[java.util.UUID]]]
    , typeOf[OptListUUIDValue].member("optListUUID": TermName).asMethod.returnType
    )
}

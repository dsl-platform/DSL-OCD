package com.dslplatform.ocd.values

import ListUUIDInValue.ListUUIDValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListUUIDValue extends SpecExtensions {
  def `Check single property type via reflection: IndexedSeq[java.util.UUID]`() =
    checkType(
      typeOf[IndexedSeq[java.util.UUID]]
    , typeOf[ListUUIDValue].member("listUUID": TermName).asMethod.returnType
    )
}

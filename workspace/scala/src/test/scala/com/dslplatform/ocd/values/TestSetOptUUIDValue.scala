package com.dslplatform.ocd.values

import SetOptUUIDInValue.SetOptUUIDValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptUUIDValue extends SpecExtensions {
  def `Check single property type via reflection: Set[Option[java.util.UUID]]`() =
    checkType(
      typeOf[Set[Option[java.util.UUID]]]
    , typeOf[SetOptUUIDValue].member("setOptUUID": TermName).asMethod.returnType
    )
}

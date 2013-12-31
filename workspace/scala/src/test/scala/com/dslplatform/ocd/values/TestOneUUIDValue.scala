package com.dslplatform.ocd.values

import OneUUIDInValue.OneUUIDValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneUUIDValue extends SpecExtensions {
  def `Test property field type: java.util.UUID`() =
    checkType(
      typeOf[java.util.UUID]
    , typeOf[OneUUIDValue].member("oneUUID": TermName).asMethod.returnType
    )

  def `Test property default value: java.util.UUID.randomUUID`() {
    assert(OneUUIDValue().oneUUID.getClass == classOf[java.util.UUID]);
  }
}

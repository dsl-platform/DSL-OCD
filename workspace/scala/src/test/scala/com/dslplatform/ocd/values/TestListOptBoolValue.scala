package com.dslplatform.ocd.values

import ListOptBoolInValue.ListOptBoolValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptBoolValue extends SpecExtensions {
  def `Check single property type via reflection: IndexedSeq[Option[Boolean]]`() =
    checkType(
      typeOf[IndexedSeq[Option[Boolean]]]
    , typeOf[ListOptBoolValue].member("listOptBool": TermName).asMethod.returnType
    )
}

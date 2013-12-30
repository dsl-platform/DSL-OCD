package com.dslplatform.ocd.values

import ListOptStringInValue.ListOptStringValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptStringValue extends SpecExtensions {
  def `Check single property type via reflection: IndexedSeq[Option[String]]`() =
    checkType(
      typeOf[IndexedSeq[Option[String]]]
    , typeOf[ListOptStringValue].member("listOptString": TermName).asMethod.returnType
    )
}

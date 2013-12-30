package com.dslplatform.ocd.values

import ListOptMapInValue.ListOptMapValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptMapValue extends SpecExtensions {
  def `Check single property type via reflection: IndexedSeq[Option[Map[String, String]]]`() =
    checkType(
      typeOf[IndexedSeq[Option[Map[String, String]]]]
    , typeOf[ListOptMapValue].member("listOptMap": TermName).asMethod.returnType
    )
}

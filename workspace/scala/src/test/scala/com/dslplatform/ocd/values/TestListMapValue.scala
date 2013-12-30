package com.dslplatform.ocd.values

import ListMapInValue.ListMapValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListMapValue extends SpecExtensions {
  def `Check single property type via reflection: IndexedSeq[Map[String, String]]`() =
    checkType(
      typeOf[IndexedSeq[Map[String, String]]]
    , typeOf[ListMapValue].member("listMap": TermName).asMethod.returnType
    )
}

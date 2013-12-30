package com.dslplatform.ocd.values

import ListBoolInValue.ListBoolValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListBoolValue extends SpecExtensions {
  def `Check single property type via reflection: IndexedSeq[Boolean]`() =
    checkType(
      typeOf[IndexedSeq[Boolean]]
    , typeOf[ListBoolValue].member("listBool": TermName).asMethod.returnType
    )
}

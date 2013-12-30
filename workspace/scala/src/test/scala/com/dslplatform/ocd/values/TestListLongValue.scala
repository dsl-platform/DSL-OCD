package com.dslplatform.ocd.values

import ListLongInValue.ListLongValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListLongValue extends SpecExtensions {
  def `Check single property type via reflection: IndexedSeq[Long]`() =
    checkType(
      typeOf[IndexedSeq[Long]]
    , typeOf[ListLongValue].member("listLong": TermName).asMethod.returnType
    )
}

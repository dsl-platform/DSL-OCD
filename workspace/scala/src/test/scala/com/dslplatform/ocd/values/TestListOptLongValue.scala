package com.dslplatform.ocd.values

import ListOptLongInValue.ListOptLongValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptLongValue extends SpecExtensions {
  def `Check single property type via reflection: IndexedSeq[Option[Long]]`() =
    checkType(
      typeOf[IndexedSeq[Option[Long]]]
    , typeOf[ListOptLongValue].member("listOptLong": TermName).asMethod.returnType
    )
}

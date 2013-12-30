package com.dslplatform.ocd.values

import OptListOptLongInValue.OptListOptLongValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListOptLongValue extends SpecExtensions {
  def `Check single property type via reflection: Option[IndexedSeq[Option[Long]]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Option[Long]]]]
    , typeOf[OptListOptLongValue].member("optListOptLong": TermName).asMethod.returnType
    )
}

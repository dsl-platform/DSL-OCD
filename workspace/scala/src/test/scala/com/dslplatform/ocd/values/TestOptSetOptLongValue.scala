package com.dslplatform.ocd.values

import OptSetOptLongInValue.OptSetOptLongValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetOptLongValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Set[Option[Long]]]`() =
    checkType(
      typeOf[Option[Set[Option[Long]]]]
    , typeOf[OptSetOptLongValue].member("optSetOptLong": TermName).asMethod.returnType
    )
}

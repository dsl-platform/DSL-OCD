package com.dslplatform.ocd.values

import OptArrayOptLongInValue.OptArrayOptLongValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayOptLongValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Array[Option[Long]]]`() =
    checkType(
      typeOf[Option[Array[Option[Long]]]]
    , typeOf[OptArrayOptLongValue].member("optArrayOptLong": TermName).asMethod.returnType
    )
}

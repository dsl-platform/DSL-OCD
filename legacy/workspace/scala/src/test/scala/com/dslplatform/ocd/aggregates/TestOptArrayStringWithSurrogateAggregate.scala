package com.dslplatform.ocd.aggregates

import OptArrayStringWithSurrogateInAggregate.OptArrayStringWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayStringWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Array[String]]`() =
    checkType(
      typeOf[Option[Array[String]]]
    , typeOf[OptArrayStringWithSurrogateAggregate].member("optArrayString": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayStringWithSurrogateAggregate().optArrayString === None)
  }
}

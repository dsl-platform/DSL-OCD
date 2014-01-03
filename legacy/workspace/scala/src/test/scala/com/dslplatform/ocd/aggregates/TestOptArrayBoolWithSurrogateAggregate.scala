package com.dslplatform.ocd.aggregates

import OptArrayBoolWithSurrogateInAggregate.OptArrayBoolWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayBoolWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Array[Boolean]]`() =
    checkType(
      typeOf[Option[Array[Boolean]]]
    , typeOf[OptArrayBoolWithSurrogateAggregate].member("optArrayBool": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayBoolWithSurrogateAggregate().optArrayBool === None)
  }
}

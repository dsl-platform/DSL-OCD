package com.dslplatform.ocd.aggregates

import OptArrayOptBoolWithSurrogateInAggregate.OptArrayOptBoolWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayOptBoolWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Array[Option[Boolean]]]`() =
    checkType(
      typeOf[Option[Array[Option[Boolean]]]]
    , typeOf[OptArrayOptBoolWithSurrogateAggregate].member("optArrayOptBool": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayOptBoolWithSurrogateAggregate().optArrayOptBool === None)
  }
}

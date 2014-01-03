package com.dslplatform.ocd.aggregates

import OptArrayOptStringWithSurrogateInAggregate.OptArrayOptStringWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayOptStringWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Array[Option[String]]]`() =
    checkType(
      typeOf[Option[Array[Option[String]]]]
    , typeOf[OptArrayOptStringWithSurrogateAggregate].member("optArrayOptString": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayOptStringWithSurrogateAggregate().optArrayOptString === None)
  }
}

package com.dslplatform.ocd.aggregates

import OptArrayMapWithSurrogateInAggregate.OptArrayMapWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayMapWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Array[Map[String, String]]]`() =
    checkType(
      typeOf[Option[Array[Map[String, String]]]]
    , typeOf[OptArrayMapWithSurrogateAggregate].member("optArrayMap": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayMapWithSurrogateAggregate().optArrayMap === None)
  }
}

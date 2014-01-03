package com.dslplatform.ocd.aggregates

import OptArrayOptMapWithSurrogateInAggregate.OptArrayOptMapWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayOptMapWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Array[Option[Map[String, String]]]]`() =
    checkType(
      typeOf[Option[Array[Option[Map[String, String]]]]]
    , typeOf[OptArrayOptMapWithSurrogateAggregate].member("optArrayOptMap": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayOptMapWithSurrogateAggregate().optArrayOptMap === None)
  }
}

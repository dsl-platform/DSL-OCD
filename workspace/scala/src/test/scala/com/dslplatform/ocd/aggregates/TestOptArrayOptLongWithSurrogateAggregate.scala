package com.dslplatform.ocd.aggregates

import OptArrayOptLongWithSurrogateInAggregate.OptArrayOptLongWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayOptLongWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Array[Option[Long]]]`() =
    checkType(
      typeOf[Option[Array[Option[Long]]]]
    , typeOf[OptArrayOptLongWithSurrogateAggregate].member("optArrayOptLong": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayOptLongWithSurrogateAggregate().optArrayOptLong === None)
  }
}

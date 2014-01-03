package com.dslplatform.ocd.aggregates

import OptArrayLongWithSurrogateInAggregate.OptArrayLongWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayLongWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Array[Long]]`() =
    checkType(
      typeOf[Option[Array[Long]]]
    , typeOf[OptArrayLongWithSurrogateAggregate].member("optArrayLong": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayLongWithSurrogateAggregate().optArrayLong === None)
  }
}

package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup
package TimestampTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneArrayOfNullableTimestamps_2
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneArrayOfNullableTimestamps_2]
          .member("oneArrayOfNullableTimestamps": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Array[Option[org.joda.time.DateTime]]]
      , typeOf[OneArrayOfNullableTimestamps_2]
          .member("oneArrayOfNullableTimestamps": TermName)
          .asMethod.returnType
      )
}
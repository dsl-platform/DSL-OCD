package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup
package TimestampTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableSetOfNullableTimestamps_5
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[NullableSetOfNullableTimestamps_5]
          .member("nullableSetOfNullableTimestamps": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[Set[Option[org.joda.time.DateTime]]]]
      , typeOf[NullableSetOfNullableTimestamps_5]
          .member("nullableSetOfNullableTimestamps": TermName)
          .asMethod.returnType
      )
}

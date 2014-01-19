package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup
package TimestampTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableTimestamp_5
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[NullableTimestamp_5]
          .member("nullableTimestamp": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[org.joda.time.DateTime]]
      , typeOf[NullableTimestamp_5]
          .member("nullableTimestamp": TermName)
          .asMethod.returnType
      )
}

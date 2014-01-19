package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup
package DateTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableArrayOfNullableDates_5
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[NullableArrayOfNullableDates_5]
          .member("nullableArrayOfNullableDates": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[Array[Option[org.joda.time.LocalDate]]]]
      , typeOf[NullableArrayOfNullableDates_5]
          .member("nullableArrayOfNullableDates": TermName)
          .asMethod.returnType
      )
}

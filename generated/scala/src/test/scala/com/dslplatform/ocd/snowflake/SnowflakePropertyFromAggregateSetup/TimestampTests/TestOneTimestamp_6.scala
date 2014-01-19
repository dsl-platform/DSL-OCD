package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup
package TimestampTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneTimestamp_6
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneTimestamp_6]
          .member("oneTimestamp": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[org.joda.time.DateTime]
      , typeOf[OneTimestamp_6]
          .member("oneTimestamp": TermName)
          .asMethod.returnType
      )
}

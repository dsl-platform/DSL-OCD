package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup
package TimestampTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneSetOfOneTimestamps_6
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneSetOfOneTimestamps_6]
          .member("oneSetOfOneTimestamps": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Set[org.joda.time.DateTime]]
      , typeOf[OneSetOfOneTimestamps_6]
          .member("oneSetOfOneTimestamps": TermName)
          .asMethod.returnType
      )
}

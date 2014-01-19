package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup
package IpTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableListOfNullableIps_5
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[NullableListOfNullableIps_5]
          .member("nullableListOfNullableIps": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[IndexedSeq[Option[java.net.InetAddress]]]]
      , typeOf[NullableListOfNullableIps_5]
          .member("nullableListOfNullableIps": TermName)
          .asMethod.returnType
      )
}

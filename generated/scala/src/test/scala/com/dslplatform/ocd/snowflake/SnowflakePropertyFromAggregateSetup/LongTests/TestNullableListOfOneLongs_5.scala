package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup
package LongTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableListOfOneLongs_5
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[NullableListOfOneLongs_5]
          .member("nullableListOfOneLongs": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[IndexedSeq[Long]]]
      , typeOf[NullableListOfOneLongs_5]
          .member("nullableListOfOneLongs": TermName)
          .asMethod.returnType
      )
}

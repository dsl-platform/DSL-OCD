package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup
package StringWithMaxLengthOf9Tests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableListOfOneStringsWithMaxLengthOf9_5
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[NullableListOfOneStringsWithMaxLengthOf9_5]
          .member("nullableListOfOneStringsWithMaxLengthOf9": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[IndexedSeq[String]]]
      , typeOf[NullableListOfOneStringsWithMaxLengthOf9_5]
          .member("nullableListOfOneStringsWithMaxLengthOf9": TermName)
          .asMethod.returnType
      )
}

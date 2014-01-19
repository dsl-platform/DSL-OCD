package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup
package MapTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableListOfNullableMaps_5
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[NullableListOfNullableMaps_5]
          .member("nullableListOfNullableMaps": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[IndexedSeq[Option[Map[String, String]]]]]
      , typeOf[NullableListOfNullableMaps_5]
          .member("nullableListOfNullableMaps": TermName)
          .asMethod.returnType
      )
}

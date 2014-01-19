package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup
package MapTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableSetOfNullableMaps_5
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[NullableSetOfNullableMaps_5]
          .member("nullableSetOfNullableMaps": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[Set[Option[Map[String, String]]]]]
      , typeOf[NullableSetOfNullableMaps_5]
          .member("nullableSetOfNullableMaps": TermName)
          .asMethod.returnType
      )
}

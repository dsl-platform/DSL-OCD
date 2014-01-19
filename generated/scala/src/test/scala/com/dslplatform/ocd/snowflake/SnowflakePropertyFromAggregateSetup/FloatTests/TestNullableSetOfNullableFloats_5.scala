package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup
package FloatTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableSetOfNullableFloats_5
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[NullableSetOfNullableFloats_5]
          .member("nullableSetOfNullableFloats": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[Set[Option[Float]]]]
      , typeOf[NullableSetOfNullableFloats_5]
          .member("nullableSetOfNullableFloats": TermName)
          .asMethod.returnType
      )
}

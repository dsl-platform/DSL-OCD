package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup
package IntegerTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableSetOfOneIntegers_5
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[NullableSetOfOneIntegers_5]
          .member("nullableSetOfOneIntegers": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[Set[Int]]]
      , typeOf[NullableSetOfOneIntegers_5]
          .member("nullableSetOfOneIntegers": TermName)
          .asMethod.returnType
      )
}

package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup
package BooleanTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneSetOfOneBooleans_6
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneSetOfOneBooleans_6]
          .member("oneSetOfOneBooleans": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Set[Boolean]]
      , typeOf[OneSetOfOneBooleans_6]
          .member("oneSetOfOneBooleans": TermName)
          .asMethod.returnType
      )
}

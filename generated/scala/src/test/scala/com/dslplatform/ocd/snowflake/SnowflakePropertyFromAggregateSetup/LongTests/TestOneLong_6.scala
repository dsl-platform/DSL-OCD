package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup
package LongTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneLong_6
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneLong_6]
          .member("oneLong": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Long]
      , typeOf[OneLong_6]
          .member("oneLong": TermName)
          .asMethod.returnType
      )
}

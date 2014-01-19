package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup
package LongTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneArrayOfNullableLongs_6
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneArrayOfNullableLongs_6]
          .member("oneArrayOfNullableLongs": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Array[Option[Long]]]
      , typeOf[OneArrayOfNullableLongs_6]
          .member("oneArrayOfNullableLongs": TermName)
          .asMethod.returnType
      )
}

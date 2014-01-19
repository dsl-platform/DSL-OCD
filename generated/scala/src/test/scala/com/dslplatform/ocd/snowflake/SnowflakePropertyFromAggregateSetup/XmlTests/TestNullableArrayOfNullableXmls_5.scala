package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup
package XmlTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableArrayOfNullableXmls_5
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[NullableArrayOfNullableXmls_5]
          .member("nullableArrayOfNullableXmls": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[Array[Option[scala.xml.Elem]]]]
      , typeOf[NullableArrayOfNullableXmls_5]
          .member("nullableArrayOfNullableXmls": TermName)
          .asMethod.returnType
      )
}

package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup
package XmlTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneSetOfNullableXmls_5
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneSetOfNullableXmls_5]
          .member("oneSetOfNullableXmls": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Set[Option[scala.xml.Elem]]]
      , typeOf[OneSetOfNullableXmls_5]
          .member("oneSetOfNullableXmls": TermName)
          .asMethod.returnType
      )
}

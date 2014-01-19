package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup
package XmlTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableSetOfOneXmls_5
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[NullableSetOfOneXmls_5]
          .member("nullableSetOfOneXmls": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[Set[scala.xml.Elem]]]
      , typeOf[NullableSetOfOneXmls_5]
          .member("nullableSetOfOneXmls": TermName)
          .asMethod.returnType
      )
}

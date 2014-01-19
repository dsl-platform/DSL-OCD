package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup
package MoneyTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneListOfNullableMonies_6
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneListOfNullableMonies_6]
          .member("oneListOfNullableMonies": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[IndexedSeq[Option[BigDecimal]]]
      , typeOf[OneListOfNullableMonies_6]
          .member("oneListOfNullableMonies": TermName)
          .asMethod.returnType
      )
}

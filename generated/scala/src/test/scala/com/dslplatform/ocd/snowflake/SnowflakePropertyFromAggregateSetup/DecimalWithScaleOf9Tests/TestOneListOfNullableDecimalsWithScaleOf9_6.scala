package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup
package DecimalWithScaleOf9Tests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneListOfNullableDecimalsWithScaleOf9_6
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneListOfNullableDecimalsWithScaleOf9_6]
          .member("oneListOfNullableDecimalsWithScaleOf9": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[IndexedSeq[Option[BigDecimal]]]
      , typeOf[OneListOfNullableDecimalsWithScaleOf9_6]
          .member("oneListOfNullableDecimalsWithScaleOf9": TermName)
          .asMethod.returnType
      )
}

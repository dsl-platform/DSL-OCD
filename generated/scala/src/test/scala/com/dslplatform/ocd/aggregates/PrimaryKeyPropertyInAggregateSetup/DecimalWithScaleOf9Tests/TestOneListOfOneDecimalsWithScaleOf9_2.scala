package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup
package DecimalWithScaleOf9Tests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneListOfOneDecimalsWithScaleOf9_2
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneListOfOneDecimalsWithScaleOf9_2]
          .member("oneListOfOneDecimalsWithScaleOf9": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[IndexedSeq[BigDecimal]]
      , typeOf[OneListOfOneDecimalsWithScaleOf9_2]
          .member("oneListOfOneDecimalsWithScaleOf9": TermName)
          .asMethod.returnType
      )
}

package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup
package DecimalTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneListOfOneDecimals_4
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneListOfOneDecimals_4]
          .member("oneListOfOneDecimals": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[IndexedSeq[BigDecimal]]
      , typeOf[OneListOfOneDecimals_4]
          .member("oneListOfOneDecimals": TermName)
          .asMethod.returnType
      )
}

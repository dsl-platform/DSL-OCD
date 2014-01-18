package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup
package DateTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneListOfOneDates_4
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneListOfOneDates_4]
          .member("oneListOfOneDates": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[IndexedSeq[org.joda.time.LocalDate]]
      , typeOf[OneListOfOneDates_4]
          .member("oneListOfOneDates": TermName)
          .asMethod.returnType
      )
}

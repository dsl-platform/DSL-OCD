package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup
package DateTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableSetOfOneDates_4
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[NullableSetOfOneDates_4]
          .member("nullableSetOfOneDates": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[Set[org.joda.time.LocalDate]]]
      , typeOf[NullableSetOfOneDates_4]
          .member("nullableSetOfOneDates": TermName)
          .asMethod.returnType
      )
}

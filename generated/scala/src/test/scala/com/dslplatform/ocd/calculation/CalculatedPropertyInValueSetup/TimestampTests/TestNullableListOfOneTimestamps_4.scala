package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup
package TimestampTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableListOfOneTimestamps_4
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[NullableListOfOneTimestamps_4]
          .member("nullableListOfOneTimestamps": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[IndexedSeq[org.joda.time.DateTime]]]
      , typeOf[NullableListOfOneTimestamps_4]
          .member("nullableListOfOneTimestamps": TermName)
          .asMethod.returnType
      )
}

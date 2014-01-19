package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup
package TimestampTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneListOfNullableTimestamps_5
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneListOfNullableTimestamps_5]
          .member("oneListOfNullableTimestamps": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[IndexedSeq[Option[org.joda.time.DateTime]]]
      , typeOf[OneListOfNullableTimestamps_5]
          .member("oneListOfNullableTimestamps": TermName)
          .asMethod.returnType
      )
}

package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup
package TimestampTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableArrayOfOneTimestamps_4
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[NullableArrayOfOneTimestamps_4]
          .member("nullableArrayOfOneTimestamps": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[Array[org.joda.time.DateTime]]]
      , typeOf[NullableArrayOfOneTimestamps_4]
          .member("nullableArrayOfOneTimestamps": TermName)
          .asMethod.returnType
      )
}

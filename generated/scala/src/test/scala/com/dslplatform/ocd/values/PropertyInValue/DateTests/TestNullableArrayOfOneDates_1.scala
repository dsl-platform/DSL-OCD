package com.dslplatform.ocd.values.PropertyInValue
package DateTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableArrayOfOneDates_1
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[NullableArrayOfOneDates_1]
          .member("nullableArrayOfOneDates": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[Array[org.joda.time.LocalDate]]]
      , typeOf[NullableArrayOfOneDates_1]
          .member("nullableArrayOfOneDates": TermName)
          .asMethod.returnType
      )
}

package com.dslplatform.ocd.values.PropertyInValue
package MoneyTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableArrayOfNullableMonies_1
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[NullableArrayOfNullableMonies_1]
          .member("nullableArrayOfNullableMonies": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[Array[Option[BigDecimal]]]]
      , typeOf[NullableArrayOfNullableMonies_1]
          .member("nullableArrayOfNullableMonies": TermName)
          .asMethod.returnType
      )
}

package com.dslplatform.ocd.values.PropertyInValue
package MoneyTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableArrayOfOneMonies_1
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[NullableArrayOfOneMonies_1]
          .member("nullableArrayOfOneMonies": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[Array[BigDecimal]]]
      , typeOf[NullableArrayOfOneMonies_1]
          .member("nullableArrayOfOneMonies": TermName)
          .asMethod.returnType
      )
}
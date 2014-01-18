package com.dslplatform.ocd.values.PropertyInValue
package BooleanTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableArrayOfNullableBooleans_1
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[NullableArrayOfNullableBooleans_1]
          .member("nullableArrayOfNullableBooleans": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[Array[Option[Boolean]]]]
      , typeOf[NullableArrayOfNullableBooleans_1]
          .member("nullableArrayOfNullableBooleans": TermName)
          .asMethod.returnType
      )
}

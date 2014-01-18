package com.dslplatform.ocd.values.PropertyInValue
package BinaryTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableArrayOfOneBinaries_1
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[NullableArrayOfOneBinaries_1]
          .member("nullableArrayOfOneBinaries": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[Array[Array[Byte]]]]
      , typeOf[NullableArrayOfOneBinaries_1]
          .member("nullableArrayOfOneBinaries": TermName)
          .asMethod.returnType
      )
}

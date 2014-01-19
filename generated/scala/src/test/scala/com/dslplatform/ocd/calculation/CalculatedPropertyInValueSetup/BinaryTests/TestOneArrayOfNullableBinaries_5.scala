package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup
package BinaryTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneArrayOfNullableBinaries_5
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneArrayOfNullableBinaries_5]
          .member("oneArrayOfNullableBinaries": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Array[Option[Array[Byte]]]]
      , typeOf[OneArrayOfNullableBinaries_5]
          .member("oneArrayOfNullableBinaries": TermName)
          .asMethod.returnType
      )
}

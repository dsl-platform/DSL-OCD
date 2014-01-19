package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup
package BinaryTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableListOfOneBinaries_4
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[NullableListOfOneBinaries_4]
          .member("nullableListOfOneBinaries": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[IndexedSeq[Array[Byte]]]]
      , typeOf[NullableListOfOneBinaries_4]
          .member("nullableListOfOneBinaries": TermName)
          .asMethod.returnType
      )
}

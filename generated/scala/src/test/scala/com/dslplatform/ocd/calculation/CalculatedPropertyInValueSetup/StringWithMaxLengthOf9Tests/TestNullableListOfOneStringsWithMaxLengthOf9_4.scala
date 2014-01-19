package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup
package StringWithMaxLengthOf9Tests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableListOfOneStringsWithMaxLengthOf9_4
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[NullableListOfOneStringsWithMaxLengthOf9_4]
          .member("nullableListOfOneStringsWithMaxLengthOf9": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[IndexedSeq[String]]]
      , typeOf[NullableListOfOneStringsWithMaxLengthOf9_4]
          .member("nullableListOfOneStringsWithMaxLengthOf9": TermName)
          .asMethod.returnType
      )
}

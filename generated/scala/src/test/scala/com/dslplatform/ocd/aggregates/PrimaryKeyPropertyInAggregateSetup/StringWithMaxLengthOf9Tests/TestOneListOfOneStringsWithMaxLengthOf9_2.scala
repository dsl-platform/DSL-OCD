package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup
package StringWithMaxLengthOf9Tests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneListOfOneStringsWithMaxLengthOf9_2
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneListOfOneStringsWithMaxLengthOf9_2]
          .member("oneListOfOneStringsWithMaxLengthOf9": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[IndexedSeq[String]]
      , typeOf[OneListOfOneStringsWithMaxLengthOf9_2]
          .member("oneListOfOneStringsWithMaxLengthOf9": TermName)
          .asMethod.returnType
      )
}
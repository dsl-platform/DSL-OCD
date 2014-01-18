package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup
package BinaryTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneListOfNullableBinaries_2
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneListOfNullableBinaries_2]
          .member("oneListOfNullableBinaries": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[IndexedSeq[Option[Array[Byte]]]]
      , typeOf[OneListOfNullableBinaries_2]
          .member("oneListOfNullableBinaries": TermName)
          .asMethod.returnType
      )
}

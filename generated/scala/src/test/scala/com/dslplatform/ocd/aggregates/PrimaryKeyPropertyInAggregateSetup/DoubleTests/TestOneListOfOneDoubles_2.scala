package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup
package DoubleTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneListOfOneDoubles_2
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneListOfOneDoubles_2]
          .member("oneListOfOneDoubles": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[IndexedSeq[Double]]
      , typeOf[OneListOfOneDoubles_2]
          .member("oneListOfOneDoubles": TermName)
          .asMethod.returnType
      )
}

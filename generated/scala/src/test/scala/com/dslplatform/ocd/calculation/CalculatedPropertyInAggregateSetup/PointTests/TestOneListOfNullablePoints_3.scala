package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup
package PointTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneListOfNullablePoints_3
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneListOfNullablePoints_3]
          .member("oneListOfNullablePoints": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[IndexedSeq[Option[java.awt.geom.Point2D]]]
      , typeOf[OneListOfNullablePoints_3]
          .member("oneListOfNullablePoints": TermName)
          .asMethod.returnType
      )
}

package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup
package RectangleTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableListOfOneRectangles_3
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[NullableListOfOneRectangles_3]
          .member("nullableListOfOneRectangles": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[IndexedSeq[java.awt.geom.Rectangle2D]]]
      , typeOf[NullableListOfOneRectangles_3]
          .member("nullableListOfOneRectangles": TermName)
          .asMethod.returnType
      )
}

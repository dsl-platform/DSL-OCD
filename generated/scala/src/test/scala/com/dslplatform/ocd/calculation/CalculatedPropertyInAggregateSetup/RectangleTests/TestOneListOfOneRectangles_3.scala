package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup
package RectangleTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneListOfOneRectangles_3
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneListOfOneRectangles_3]
          .member("oneListOfOneRectangles": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[IndexedSeq[java.awt.geom.Rectangle2D]]
      , typeOf[OneListOfOneRectangles_3]
          .member("oneListOfOneRectangles": TermName)
          .asMethod.returnType
      )
}

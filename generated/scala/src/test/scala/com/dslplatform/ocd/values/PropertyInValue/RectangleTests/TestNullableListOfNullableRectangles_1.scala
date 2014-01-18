package com.dslplatform.ocd.values.PropertyInValue
package RectangleTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableListOfNullableRectangles_1
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[NullableListOfNullableRectangles_1]
          .member("nullableListOfNullableRectangles": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[IndexedSeq[Option[java.awt.geom.Rectangle2D]]]]
      , typeOf[NullableListOfNullableRectangles_1]
          .member("nullableListOfNullableRectangles": TermName)
          .asMethod.returnType
      )
}

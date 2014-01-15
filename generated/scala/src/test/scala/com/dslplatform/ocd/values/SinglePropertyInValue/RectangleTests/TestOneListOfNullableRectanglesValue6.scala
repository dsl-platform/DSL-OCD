package com.dslplatform.ocd.values.SinglePropertyInValue.RectangleTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableRectanglesValue6
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneListOfNullableRectanglesValue6
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneListOfNullableRectanglesValue6]
          .member("oneListOfNullableRectangles": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[List[Option[java.awt.geom.Rectangle2D]]]
      , typeOf[OneListOfNullableRectanglesValue6]
          .member("oneListOfNullableRectangles": TermName)
          .asMethod.returnType
      )
}

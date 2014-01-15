package com.dslplatform.ocd.values.SinglePropertyInValue.RectangleTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableRectanglesValue2
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneSetOfNullableRectanglesValue2
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneSetOfNullableRectanglesValue2]
          .member("oneSetOfNullableRectangles": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Set[Option[java.awt.geom.Rectangle2D]]]
      , typeOf[OneSetOfNullableRectanglesValue2]
          .member("oneSetOfNullableRectangles": TermName)
          .asMethod.returnType
      )
}

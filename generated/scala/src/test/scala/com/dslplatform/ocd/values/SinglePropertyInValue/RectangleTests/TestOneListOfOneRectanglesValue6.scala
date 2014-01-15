package com.dslplatform.ocd.values.SinglePropertyInValue.RectangleTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneRectanglesValue6
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneListOfOneRectanglesValue6
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneListOfOneRectanglesValue6]
          .member("oneListOfOneRectangles": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[List[java.awt.geom.Rectangle2D]]
      , typeOf[OneListOfOneRectanglesValue6]
          .member("oneListOfOneRectangles": TermName)
          .asMethod.returnType
      )
}

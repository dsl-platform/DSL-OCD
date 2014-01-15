package com.dslplatform.ocd.values.SinglePropertyInValue.RectangleTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneRectangleValue4
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneRectangleValue4
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneRectangleValue4]
          .member("oneRectangle": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[java.awt.geom.Rectangle2D]
      , typeOf[OneRectangleValue4]
          .member("oneRectangle": TermName)
          .asMethod.returnType
      )
}

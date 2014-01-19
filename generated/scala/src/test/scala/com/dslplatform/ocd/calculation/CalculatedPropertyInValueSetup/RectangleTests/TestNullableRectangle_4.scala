package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup
package RectangleTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableRectangle_4
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[NullableRectangle_4]
          .member("nullableRectangle": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[java.awt.geom.Rectangle2D]]
      , typeOf[NullableRectangle_4]
          .member("nullableRectangle": TermName)
          .asMethod.returnType
      )
}
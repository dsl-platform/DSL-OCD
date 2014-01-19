package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup
package RectangleTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneRectangle_4
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneRectangle_4]
          .member("oneRectangle": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[java.awt.geom.Rectangle2D]
      , typeOf[OneRectangle_4]
          .member("oneRectangle": TermName)
          .asMethod.returnType
      )
}
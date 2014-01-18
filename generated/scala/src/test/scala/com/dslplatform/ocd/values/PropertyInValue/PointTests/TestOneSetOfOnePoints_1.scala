package com.dslplatform.ocd.values.PropertyInValue
package PointTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneSetOfOnePoints_1
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneSetOfOnePoints_1]
          .member("oneSetOfOnePoints": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Set[java.awt.geom.Point2D]]
      , typeOf[OneSetOfOnePoints_1]
          .member("oneSetOfOnePoints": TermName)
          .asMethod.returnType
      )
}

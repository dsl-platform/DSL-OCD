package com.dslplatform.ocd.values.SinglePropertyInValue.PointTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOnePointsValue2
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneListOfOnePointsValue2
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[OneListOfOnePointsValue2]
          .member("oneListOfOnePoints": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[List[java.awt.geom.Point2D]]
      , typeOf[OneListOfOnePointsValue2]
          .member("oneListOfOnePoints": TermName)
          .asMethod.returnType
      )
}

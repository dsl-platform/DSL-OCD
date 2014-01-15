package com.dslplatform.ocd.values.SinglePropertyInValue.PointTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullablePointsValue6
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableArrayOfNullablePointsValue6
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[NullableArrayOfNullablePointsValue6]
          .member("nullableArrayOfNullablePoints": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[Array[Option[java.awt.geom.Point2D]]]]
      , typeOf[NullableArrayOfNullablePointsValue6]
          .member("nullableArrayOfNullablePoints": TermName)
          .asMethod.returnType
      )
}

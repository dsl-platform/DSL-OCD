package com.dslplatform.ocd.values.SinglePropertyInValue.PointTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.NullablePointValue3
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullablePointValue3
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[NullablePointValue3]
          .member("nullablePoint": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[java.awt.geom.Point2D]]
      , typeOf[NullablePointValue3]
          .member("nullablePoint": TermName)
          .asMethod.returnType
      )
}

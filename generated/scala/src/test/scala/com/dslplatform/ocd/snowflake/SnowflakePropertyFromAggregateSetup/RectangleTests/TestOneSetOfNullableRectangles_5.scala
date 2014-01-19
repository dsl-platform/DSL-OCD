package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup
package RectangleTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneSetOfNullableRectangles_5
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneSetOfNullableRectangles_5]
          .member("oneSetOfNullableRectangles": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Set[Option[java.awt.geom.Rectangle2D]]]
      , typeOf[OneSetOfNullableRectangles_5]
          .member("oneSetOfNullableRectangles": TermName)
          .asMethod.returnType
      )
}

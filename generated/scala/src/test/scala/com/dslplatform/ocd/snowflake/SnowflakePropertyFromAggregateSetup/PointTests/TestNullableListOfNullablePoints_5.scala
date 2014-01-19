package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup
package PointTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableListOfNullablePoints_5
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[NullableListOfNullablePoints_5]
          .member("nullableListOfNullablePoints": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[IndexedSeq[Option[java.awt.geom.Point2D]]]]
      , typeOf[NullableListOfNullablePoints_5]
          .member("nullableListOfNullablePoints": TermName)
          .asMethod.returnType
      )
}

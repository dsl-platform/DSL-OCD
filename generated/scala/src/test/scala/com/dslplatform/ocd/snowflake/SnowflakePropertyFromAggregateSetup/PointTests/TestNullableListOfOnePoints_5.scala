package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup
package PointTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableListOfOnePoints_5
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[NullableListOfOnePoints_5]
          .member("nullableListOfOnePoints": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[IndexedSeq[java.awt.geom.Point2D]]]
      , typeOf[NullableListOfOnePoints_5]
          .member("nullableListOfOnePoints": TermName)
          .asMethod.returnType
      )
}

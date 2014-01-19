package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup
package LocationTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneSetOfOneLocations_5
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneSetOfOneLocations_5]
          .member("oneSetOfOneLocations": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Set[java.awt.geom.Point2D]]
      , typeOf[OneSetOfOneLocations_5]
          .member("oneSetOfOneLocations": TermName)
          .asMethod.returnType
      )
}
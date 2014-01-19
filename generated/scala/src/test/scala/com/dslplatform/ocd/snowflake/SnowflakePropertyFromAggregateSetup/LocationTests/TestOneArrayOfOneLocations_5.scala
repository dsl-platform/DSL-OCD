package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup
package LocationTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneArrayOfOneLocations_5
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneArrayOfOneLocations_5]
          .member("oneArrayOfOneLocations": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Array[java.awt.geom.Point2D]]
      , typeOf[OneArrayOfOneLocations_5]
          .member("oneArrayOfOneLocations": TermName)
          .asMethod.returnType
      )
}

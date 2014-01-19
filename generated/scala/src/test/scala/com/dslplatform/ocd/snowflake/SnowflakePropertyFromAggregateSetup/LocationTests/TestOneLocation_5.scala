package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup
package LocationTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneLocation_5
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneLocation_5]
          .member("oneLocation": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[java.awt.geom.Point2D]
      , typeOf[OneLocation_5]
          .member("oneLocation": TermName)
          .asMethod.returnType
      )
}

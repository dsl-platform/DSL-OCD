package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup
package ImageTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableImage_5
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[NullableImage_5]
          .member("nullableImage": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[java.awt.image.BufferedImage]]
      , typeOf[NullableImage_5]
          .member("nullableImage": TermName)
          .asMethod.returnType
      )
}

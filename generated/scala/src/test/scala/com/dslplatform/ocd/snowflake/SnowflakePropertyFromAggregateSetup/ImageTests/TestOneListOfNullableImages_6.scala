package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup
package ImageTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneListOfNullableImages_6
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneListOfNullableImages_6]
          .member("oneListOfNullableImages": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[IndexedSeq[Option[java.awt.image.BufferedImage]]]
      , typeOf[OneListOfNullableImages_6]
          .member("oneListOfNullableImages": TermName)
          .asMethod.returnType
      )
}

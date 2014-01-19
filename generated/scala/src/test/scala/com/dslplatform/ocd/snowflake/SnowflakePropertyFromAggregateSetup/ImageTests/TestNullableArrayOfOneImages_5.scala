package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup
package ImageTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableArrayOfOneImages_5
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[NullableArrayOfOneImages_5]
          .member("nullableArrayOfOneImages": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[Array[java.awt.image.BufferedImage]]]
      , typeOf[NullableArrayOfOneImages_5]
          .member("nullableArrayOfOneImages": TermName)
          .asMethod.returnType
      )
}

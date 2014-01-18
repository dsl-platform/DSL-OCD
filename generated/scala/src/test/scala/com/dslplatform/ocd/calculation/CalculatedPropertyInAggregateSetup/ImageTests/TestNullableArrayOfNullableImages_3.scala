package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup
package ImageTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableArrayOfNullableImages_3
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[NullableArrayOfNullableImages_3]
          .member("nullableArrayOfNullableImages": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[Array[Option[java.awt.image.BufferedImage]]]]
      , typeOf[NullableArrayOfNullableImages_3]
          .member("nullableArrayOfNullableImages": TermName)
          .asMethod.returnType
      )
}

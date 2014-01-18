package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup
package LocationTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneArrayOfNullableLocations_3
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneArrayOfNullableLocations_3]
          .member("oneArrayOfNullableLocations": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Array[Option[java.awt.geom.Point2D]]]
      , typeOf[OneArrayOfNullableLocations_3]
          .member("oneArrayOfNullableLocations": TermName)
          .asMethod.returnType
      )
}

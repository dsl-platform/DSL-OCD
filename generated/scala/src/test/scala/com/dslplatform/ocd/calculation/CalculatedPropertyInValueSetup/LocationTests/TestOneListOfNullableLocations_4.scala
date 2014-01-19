package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup
package LocationTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneListOfNullableLocations_4
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneListOfNullableLocations_4]
          .member("oneListOfNullableLocations": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[IndexedSeq[Option[java.awt.geom.Point2D]]]
      , typeOf[OneListOfNullableLocations_4]
          .member("oneListOfNullableLocations": TermName)
          .asMethod.returnType
      )
}

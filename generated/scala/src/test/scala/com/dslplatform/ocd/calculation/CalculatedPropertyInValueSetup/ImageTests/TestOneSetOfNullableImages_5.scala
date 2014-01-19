package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup
package ImageTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneSetOfNullableImages_5
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneSetOfNullableImages_5]
          .member("oneSetOfNullableImages": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Set[Option[java.awt.image.BufferedImage]]]
      , typeOf[OneSetOfNullableImages_5]
          .member("oneSetOfNullableImages": TermName)
          .asMethod.returnType
      )
}

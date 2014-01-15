package com.dslplatform.ocd.values.SinglePropertyInValue.ImageTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableImagesValue1
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableListOfNullableImagesValue1
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[NullableListOfNullableImagesValue1]
          .member("nullableListOfNullableImages": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[List[Option[java.awt.image.BufferedImage]]]]
      , typeOf[NullableListOfNullableImagesValue1]
          .member("nullableListOfNullableImages": TermName)
          .asMethod.returnType
      )
}

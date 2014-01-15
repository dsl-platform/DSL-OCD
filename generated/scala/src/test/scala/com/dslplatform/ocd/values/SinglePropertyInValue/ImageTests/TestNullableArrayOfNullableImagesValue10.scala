package com.dslplatform.ocd.values.SinglePropertyInValue.ImageTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableImagesValue10
import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableArrayOfNullableImagesValue10
    extends OcdSpec {

    /* Testing the property field public access via reflection (no instantiation) */
    def `Test property field access`() =
      lock(
        typeOf[NullableArrayOfNullableImagesValue10]
          .member("nullableArrayOfNullableImages": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[Array[Option[java.awt.image.BufferedImage]]]]
      , typeOf[NullableArrayOfNullableImagesValue10]
          .member("nullableArrayOfNullableImages": TermName)
          .asMethod.returnType
      )
}

package com.dslplatform.ocd.values.SinglePropertyInValue.Url

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableUrlsValue4

class TestOneListOfNullableUrlsValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfNullableUrlsValue4].member("oneListOfNullableUrls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Url?>]
      , typeOf[OneListOfNullableUrlsValue4].member("oneListOfNullableUrls": TermName).asMethod.returnType
      )
}

package com.dslplatform.ocd.values.SinglePropertyInValue.Url

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableUrlsValue6

class TestOneArrayOfNullableUrlsValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfNullableUrlsValue6].member("oneArrayOfNullableUrls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Url?[]]
      , typeOf[OneArrayOfNullableUrlsValue6].member("oneArrayOfNullableUrls": TermName).asMethod.returnType
      )
}

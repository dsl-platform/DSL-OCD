package com.dslplatform.ocd.values.SinglePropertyInValue.Url

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableUrlsValue2

class TestOneArrayOfNullableUrlsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfNullableUrlsValue2].member("oneArrayOfNullableUrls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Url?[]]
      , typeOf[OneArrayOfNullableUrlsValue2].member("oneArrayOfNullableUrls": TermName).asMethod.returnType
      )
}

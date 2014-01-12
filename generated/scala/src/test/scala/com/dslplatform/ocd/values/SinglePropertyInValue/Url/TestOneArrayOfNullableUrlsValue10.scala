package com.dslplatform.ocd.values.SinglePropertyInValue.Url

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableUrlsValue10

class TestOneArrayOfNullableUrlsValue10
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfNullableUrlsValue10].member("oneArrayOfNullableUrls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Url?[]]
      , typeOf[OneArrayOfNullableUrlsValue10].member("oneArrayOfNullableUrls": TermName).asMethod.returnType
      )
}

package com.dslplatform.ocd.values.SinglePropertyInValue.Url

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableUrlsValue5

class TestOneSetOfNullableUrlsValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfNullableUrlsValue5].member("oneSetOfNullableUrls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Url?>]
      , typeOf[OneSetOfNullableUrlsValue5].member("oneSetOfNullableUrls": TermName).asMethod.returnType
      )
}

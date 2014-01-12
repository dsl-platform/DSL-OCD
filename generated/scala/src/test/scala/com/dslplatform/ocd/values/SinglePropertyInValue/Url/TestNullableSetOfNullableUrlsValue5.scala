package com.dslplatform.ocd.values.SinglePropertyInValue.Url

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableUrlsValue5

class TestNullableSetOfNullableUrlsValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfNullableUrlsValue5].member("nullableSetOfNullableUrls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Url?>?]
      , typeOf[NullableSetOfNullableUrlsValue5].member("nullableSetOfNullableUrls": TermName).asMethod.returnType
      )
}

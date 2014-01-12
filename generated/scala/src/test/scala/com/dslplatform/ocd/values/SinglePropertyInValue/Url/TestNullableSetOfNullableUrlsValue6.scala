package com.dslplatform.ocd.values.SinglePropertyInValue.Url

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableUrlsValue6

class TestNullableSetOfNullableUrlsValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfNullableUrlsValue6].member("nullableSetOfNullableUrls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Url?>?]
      , typeOf[NullableSetOfNullableUrlsValue6].member("nullableSetOfNullableUrls": TermName).asMethod.returnType
      )
}

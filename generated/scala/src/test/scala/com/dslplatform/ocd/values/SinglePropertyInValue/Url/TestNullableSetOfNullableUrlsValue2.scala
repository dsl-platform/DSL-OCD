package com.dslplatform.ocd.values.SinglePropertyInValue.Url

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableUrlsValue2

class TestNullableSetOfNullableUrlsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfNullableUrlsValue2].member("nullableSetOfNullableUrls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Url?>?]
      , typeOf[NullableSetOfNullableUrlsValue2].member("nullableSetOfNullableUrls": TermName).asMethod.returnType
      )
}

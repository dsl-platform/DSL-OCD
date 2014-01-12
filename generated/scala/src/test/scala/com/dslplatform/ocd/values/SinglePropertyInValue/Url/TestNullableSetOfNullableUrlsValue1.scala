package com.dslplatform.ocd.values.SinglePropertyInValue.Url

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableUrlsValue1

class TestNullableSetOfNullableUrlsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfNullableUrlsValue1].member("nullableSetOfNullableUrls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Url?>?]
      , typeOf[NullableSetOfNullableUrlsValue1].member("nullableSetOfNullableUrls": TermName).asMethod.returnType
      )
}

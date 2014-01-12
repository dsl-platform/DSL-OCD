package com.dslplatform.ocd.values.SinglePropertyInValue.Url

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableUrlsValue2

class TestNullableListOfNullableUrlsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfNullableUrlsValue2].member("nullableListOfNullableUrls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Url?>?]
      , typeOf[NullableListOfNullableUrlsValue2].member("nullableListOfNullableUrls": TermName).asMethod.returnType
      )
}

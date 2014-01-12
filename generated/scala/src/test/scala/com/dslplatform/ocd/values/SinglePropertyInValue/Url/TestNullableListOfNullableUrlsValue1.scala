package com.dslplatform.ocd.values.SinglePropertyInValue.Url

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableUrlsValue1

class TestNullableListOfNullableUrlsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfNullableUrlsValue1].member("nullableListOfNullableUrls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Url?>?]
      , typeOf[NullableListOfNullableUrlsValue1].member("nullableListOfNullableUrls": TermName).asMethod.returnType
      )
}

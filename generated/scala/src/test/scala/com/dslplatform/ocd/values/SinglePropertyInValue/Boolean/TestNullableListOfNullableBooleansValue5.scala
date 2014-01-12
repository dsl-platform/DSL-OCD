package com.dslplatform.ocd.values.SinglePropertyInValue.Boolean

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableBooleansValue5

class TestNullableListOfNullableBooleansValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfNullableBooleansValue5].member("nullableListOfNullableBooleans": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Boolean?>?]
      , typeOf[NullableListOfNullableBooleansValue5].member("nullableListOfNullableBooleans": TermName).asMethod.returnType
      )
}

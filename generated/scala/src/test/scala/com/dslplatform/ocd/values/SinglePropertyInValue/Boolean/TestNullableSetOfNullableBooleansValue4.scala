package com.dslplatform.ocd.values.SinglePropertyInValue.Boolean

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableBooleansValue4

class TestNullableSetOfNullableBooleansValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfNullableBooleansValue4].member("nullableSetOfNullableBooleans": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Boolean?>?]
      , typeOf[NullableSetOfNullableBooleansValue4].member("nullableSetOfNullableBooleans": TermName).asMethod.returnType
      )
}

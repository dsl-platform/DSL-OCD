package com.dslplatform.ocd.values.SinglePropertyInValue.Boolean

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableBooleansValue4

class TestOneSetOfNullableBooleansValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfNullableBooleansValue4].member("oneSetOfNullableBooleans": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Boolean?>]
      , typeOf[OneSetOfNullableBooleansValue4].member("oneSetOfNullableBooleans": TermName).asMethod.returnType
      )
}

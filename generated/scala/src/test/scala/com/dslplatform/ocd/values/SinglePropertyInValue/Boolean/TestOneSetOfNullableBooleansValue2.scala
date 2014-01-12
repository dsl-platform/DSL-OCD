package com.dslplatform.ocd.values.SinglePropertyInValue.Boolean

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableBooleansValue2

class TestOneSetOfNullableBooleansValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfNullableBooleansValue2].member("oneSetOfNullableBooleans": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Boolean?>]
      , typeOf[OneSetOfNullableBooleansValue2].member("oneSetOfNullableBooleans": TermName).asMethod.returnType
      )
}

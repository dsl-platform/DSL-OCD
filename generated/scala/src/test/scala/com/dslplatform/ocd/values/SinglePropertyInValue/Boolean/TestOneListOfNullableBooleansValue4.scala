package com.dslplatform.ocd.values.SinglePropertyInValue.Boolean

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableBooleansValue4

class TestOneListOfNullableBooleansValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfNullableBooleansValue4].member("oneListOfNullableBooleans": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Boolean?>]
      , typeOf[OneListOfNullableBooleansValue4].member("oneListOfNullableBooleans": TermName).asMethod.returnType
      )
}

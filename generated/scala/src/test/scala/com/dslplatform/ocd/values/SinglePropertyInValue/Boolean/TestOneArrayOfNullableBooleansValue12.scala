package com.dslplatform.ocd.values.SinglePropertyInValue.Boolean

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableBooleansValue12

class TestOneArrayOfNullableBooleansValue12
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfNullableBooleansValue12].member("oneArrayOfNullableBooleans": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Boolean?[]]
      , typeOf[OneArrayOfNullableBooleansValue12].member("oneArrayOfNullableBooleans": TermName).asMethod.returnType
      )
}

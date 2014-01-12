package com.dslplatform.ocd.values.SinglePropertyInValue.Boolean

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableBooleansValue8

class TestNullableArrayOfNullableBooleansValue8
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableBooleansValue8].member("nullableArrayOfNullableBooleans": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Boolean?[]?]
      , typeOf[NullableArrayOfNullableBooleansValue8].member("nullableArrayOfNullableBooleans": TermName).asMethod.returnType
      )
}

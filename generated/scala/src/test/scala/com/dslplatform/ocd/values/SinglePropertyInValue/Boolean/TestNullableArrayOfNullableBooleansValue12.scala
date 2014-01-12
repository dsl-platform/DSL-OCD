package com.dslplatform.ocd.values.SinglePropertyInValue.Boolean

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableBooleansValue12

class TestNullableArrayOfNullableBooleansValue12
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableBooleansValue12].member("nullableArrayOfNullableBooleans": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Boolean?[]?]
      , typeOf[NullableArrayOfNullableBooleansValue12].member("nullableArrayOfNullableBooleans": TermName).asMethod.returnType
      )
}

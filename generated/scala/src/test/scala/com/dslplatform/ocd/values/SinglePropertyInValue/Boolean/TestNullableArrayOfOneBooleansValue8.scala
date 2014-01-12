package com.dslplatform.ocd.values.SinglePropertyInValue.Boolean

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneBooleansValue8

class TestNullableArrayOfOneBooleansValue8
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneBooleansValue8].member("nullableArrayOfOneBooleans": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Boolean[]?]
      , typeOf[NullableArrayOfOneBooleansValue8].member("nullableArrayOfOneBooleans": TermName).asMethod.returnType
      )
}

package com.dslplatform.ocd.values.SinglePropertyInValue.Boolean

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneBooleansValue3

class TestNullableArrayOfOneBooleansValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneBooleansValue3].member("nullableArrayOfOneBooleans": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Boolean[]?]
      , typeOf[NullableArrayOfOneBooleansValue3].member("nullableArrayOfOneBooleans": TermName).asMethod.returnType
      )
}

package com.dslplatform.ocd.values.SinglePropertyInValue.Ip

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableIpsValue4

class TestNullableArrayOfNullableIpsValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableIpsValue4].member("nullableArrayOfNullableIps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Ip?[]?]
      , typeOf[NullableArrayOfNullableIpsValue4].member("nullableArrayOfNullableIps": TermName).asMethod.returnType
      )
}

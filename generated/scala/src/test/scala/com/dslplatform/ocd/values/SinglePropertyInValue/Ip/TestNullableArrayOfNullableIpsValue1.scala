package com.dslplatform.ocd.values.SinglePropertyInValue.Ip

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableIpsValue1

class TestNullableArrayOfNullableIpsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableIpsValue1].member("nullableArrayOfNullableIps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Ip?[]?]
      , typeOf[NullableArrayOfNullableIpsValue1].member("nullableArrayOfNullableIps": TermName).asMethod.returnType
      )
}

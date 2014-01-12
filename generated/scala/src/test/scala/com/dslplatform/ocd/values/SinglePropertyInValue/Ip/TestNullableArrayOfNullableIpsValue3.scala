package com.dslplatform.ocd.values.SinglePropertyInValue.Ip

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableIpsValue3

class TestNullableArrayOfNullableIpsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableIpsValue3].member("nullableArrayOfNullableIps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Ip?[]?]
      , typeOf[NullableArrayOfNullableIpsValue3].member("nullableArrayOfNullableIps": TermName).asMethod.returnType
      )
}

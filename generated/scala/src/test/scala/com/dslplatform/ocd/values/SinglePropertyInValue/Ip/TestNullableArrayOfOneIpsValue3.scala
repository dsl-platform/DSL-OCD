package com.dslplatform.ocd.values.SinglePropertyInValue.Ip

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneIpsValue3

class TestNullableArrayOfOneIpsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneIpsValue3].member("nullableArrayOfOneIps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Ip[]?]
      , typeOf[NullableArrayOfOneIpsValue3].member("nullableArrayOfOneIps": TermName).asMethod.returnType
      )
}

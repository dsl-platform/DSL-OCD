package com.dslplatform.ocd.values.SinglePropertyInValue.Ip

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableIpsValue3

class TestNullableSetOfNullableIpsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfNullableIpsValue3].member("nullableSetOfNullableIps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Ip?>?]
      , typeOf[NullableSetOfNullableIpsValue3].member("nullableSetOfNullableIps": TermName).asMethod.returnType
      )
}

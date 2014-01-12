package com.dslplatform.ocd.values.SinglePropertyInValue.Ip

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableIpsValue2

class TestNullableSetOfNullableIpsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfNullableIpsValue2].member("nullableSetOfNullableIps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Ip?>?]
      , typeOf[NullableSetOfNullableIpsValue2].member("nullableSetOfNullableIps": TermName).asMethod.returnType
      )
}

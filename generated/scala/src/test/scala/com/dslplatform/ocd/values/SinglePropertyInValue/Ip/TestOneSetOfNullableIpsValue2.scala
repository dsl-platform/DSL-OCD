package com.dslplatform.ocd.values.SinglePropertyInValue.Ip

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableIpsValue2

class TestOneSetOfNullableIpsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfNullableIpsValue2].member("oneSetOfNullableIps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Ip?>]
      , typeOf[OneSetOfNullableIpsValue2].member("oneSetOfNullableIps": TermName).asMethod.returnType
      )
}

package com.dslplatform.ocd.values.SinglePropertyInValue.Ip

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableIpsValue1

class TestOneArrayOfNullableIpsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfNullableIpsValue1].member("oneArrayOfNullableIps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Ip?[]]
      , typeOf[OneArrayOfNullableIpsValue1].member("oneArrayOfNullableIps": TermName).asMethod.returnType
      )
}

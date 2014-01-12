package com.dslplatform.ocd.values.SinglePropertyInValue.Ip

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableIpsValue6

class TestOneArrayOfNullableIpsValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfNullableIpsValue6].member("oneArrayOfNullableIps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Ip?[]]
      , typeOf[OneArrayOfNullableIpsValue6].member("oneArrayOfNullableIps": TermName).asMethod.returnType
      )
}

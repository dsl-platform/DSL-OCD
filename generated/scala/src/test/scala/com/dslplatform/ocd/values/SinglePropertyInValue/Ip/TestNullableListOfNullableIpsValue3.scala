package com.dslplatform.ocd.values.SinglePropertyInValue.Ip

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableIpsValue3

class TestNullableListOfNullableIpsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfNullableIpsValue3].member("nullableListOfNullableIps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Ip?>?]
      , typeOf[NullableListOfNullableIpsValue3].member("nullableListOfNullableIps": TermName).asMethod.returnType
      )
}

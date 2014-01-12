package com.dslplatform.ocd.values.SinglePropertyInValue.Decimal

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableDecimalValue3

class TestNullableDecimalValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableDecimalValue3].member("nullableDecimal": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Decimal?]
      , typeOf[NullableDecimalValue3].member("nullableDecimal": TermName).asMethod.returnType
      )
}

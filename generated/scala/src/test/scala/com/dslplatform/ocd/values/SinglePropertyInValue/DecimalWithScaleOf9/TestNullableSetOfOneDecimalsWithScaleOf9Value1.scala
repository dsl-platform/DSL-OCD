package com.dslplatform.ocd.values.SinglePropertyInValue.DecimalWithScaleOf9

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneDecimalsWithScaleOf9Value1

class TestNullableSetOfOneDecimalsWithScaleOf9Value1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfOneDecimalsWithScaleOf9Value1].member("nullableSetOfOneDecimalsWithScaleOf9": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Decimal(9)>?]
      , typeOf[NullableSetOfOneDecimalsWithScaleOf9Value1].member("nullableSetOfOneDecimalsWithScaleOf9": TermName).asMethod.returnType
      )
}

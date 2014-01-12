package com.dslplatform.ocd.values.SinglePropertyInValue.DecimalWithScaleOf9

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneDecimalsWithScaleOf9Value3

class TestNullableListOfOneDecimalsWithScaleOf9Value3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfOneDecimalsWithScaleOf9Value3].member("nullableListOfOneDecimalsWithScaleOf9": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Decimal(9)>?]
      , typeOf[NullableListOfOneDecimalsWithScaleOf9Value3].member("nullableListOfOneDecimalsWithScaleOf9": TermName).asMethod.returnType
      )
}

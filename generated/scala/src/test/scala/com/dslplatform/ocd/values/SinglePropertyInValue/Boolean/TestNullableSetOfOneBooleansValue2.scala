package com.dslplatform.ocd.values.SinglePropertyInValue.Boolean

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneBooleansValue2

class TestNullableSetOfOneBooleansValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfOneBooleansValue2].member("nullableSetOfOneBooleans": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Boolean>?]
      , typeOf[NullableSetOfOneBooleansValue2].member("nullableSetOfOneBooleans": TermName).asMethod.returnType
      )
}

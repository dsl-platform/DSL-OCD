package com.dslplatform.ocd.values.SinglePropertyInValue.Boolean

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneBooleansValue6

class TestNullableListOfOneBooleansValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfOneBooleansValue6].member("nullableListOfOneBooleans": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Boolean>?]
      , typeOf[NullableListOfOneBooleansValue6].member("nullableListOfOneBooleans": TermName).asMethod.returnType
      )
}

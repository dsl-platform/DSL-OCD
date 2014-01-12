package com.dslplatform.ocd.values.SinglePropertyInValue.Boolean

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneBooleansValue5

class TestNullableListOfOneBooleansValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfOneBooleansValue5].member("nullableListOfOneBooleans": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Boolean>?]
      , typeOf[NullableListOfOneBooleansValue5].member("nullableListOfOneBooleans": TermName).asMethod.returnType
      )
}

package com.dslplatform.ocd.values.SinglePropertyInValue.Boolean

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneBooleansValue4

class TestOneSetOfOneBooleansValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfOneBooleansValue4].member("oneSetOfOneBooleans": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Boolean>]
      , typeOf[OneSetOfOneBooleansValue4].member("oneSetOfOneBooleans": TermName).asMethod.returnType
      )
}

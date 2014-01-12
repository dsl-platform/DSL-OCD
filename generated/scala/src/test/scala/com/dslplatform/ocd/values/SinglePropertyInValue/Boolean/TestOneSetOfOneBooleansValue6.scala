package com.dslplatform.ocd.values.SinglePropertyInValue.Boolean

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneBooleansValue6

class TestOneSetOfOneBooleansValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfOneBooleansValue6].member("oneSetOfOneBooleans": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Boolean>]
      , typeOf[OneSetOfOneBooleansValue6].member("oneSetOfOneBooleans": TermName).asMethod.returnType
      )
}

package com.dslplatform.ocd.values.SinglePropertyInValue.Long

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableLongsValue1

class TestOneListOfNullableLongsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfNullableLongsValue1].member("oneListOfNullableLongs": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Long?>]
      , typeOf[OneListOfNullableLongsValue1].member("oneListOfNullableLongs": TermName).asMethod.returnType
      )
}

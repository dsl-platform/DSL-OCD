package com.dslplatform.ocd
package types

import box._

trait `box.Array`
    extends BoxNonNullableType
    with BoxArrayType
    with BoxElementsNonNullableType {

  def boxDesc = "Array"
}

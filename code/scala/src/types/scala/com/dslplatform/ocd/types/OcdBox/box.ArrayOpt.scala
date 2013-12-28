package com.dslplatform.ocd
package types

import box._

trait `box.ArrayOpt`
    extends BoxNonNullableType
    with BoxArrayType
    with BoxElementsNullableType {

  def boxDesc = "ArrayOpt"
}

object `box.ArrayOpt` extends `box.ArrayOpt`


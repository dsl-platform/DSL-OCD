package com.dslplatform.ocd
package types

import box._

trait `box.Set`
    extends BoxNonNullableType
    with BoxSetType
    with BoxElementsNonNullableType {

  def boxDesc = "Set"
}

object `box.Set` extends `box.Set`

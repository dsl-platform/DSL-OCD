package com.dslplatform.ocd
package types

import box._

trait `box.ListOpt`
    extends BoxNonNullableType
    with BoxListType
    with BoxElementsNullableType {

  def boxDesc = "ListOpt"
}

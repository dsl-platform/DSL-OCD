package com.dslplatform.ocd
package types

import box._

trait `box.LinkedListOpt`
    extends BoxNonNullableType
    with BoxLinkedListType
    with BoxElementsNullableType {

  def boxDesc = "LinkedListOpt"
}

object `box.LinkedListOpt` extends `box.LinkedListOpt`

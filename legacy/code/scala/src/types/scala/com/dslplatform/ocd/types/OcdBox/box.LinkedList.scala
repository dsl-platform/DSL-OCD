package com.dslplatform.ocd
package types

import box._

trait `box.LinkedList`
    extends BoxNonNullableType
    with BoxLinkedListType
    with BoxElementsNonNullableType {

  def boxDesc = "LinkedList"
}

object `box.LinkedList` extends `box.LinkedList`

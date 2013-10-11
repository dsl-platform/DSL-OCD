package com.dslplatform.ocd
package types

import box._

trait `box.OptLinkedList`
    extends BoxNullableType
    with BoxLinkedListType
    with BoxElementsNonNullableType {

  def boxDesc = "OptLinkedList"
}

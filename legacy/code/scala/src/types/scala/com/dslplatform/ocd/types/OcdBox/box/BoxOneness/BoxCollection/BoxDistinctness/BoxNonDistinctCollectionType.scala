package com.dslplatform.ocd
package types
package box

trait BoxNonDistinctCollectionType
    extends BoxDistinctnessType {

  def areElementsDistinct = false
}

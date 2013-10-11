package com.dslplatform.ocd
package types
package box

trait BoxDistinctnessType
    extends BoxCollectionType {

  def areElementsDistinct: Boolean
}

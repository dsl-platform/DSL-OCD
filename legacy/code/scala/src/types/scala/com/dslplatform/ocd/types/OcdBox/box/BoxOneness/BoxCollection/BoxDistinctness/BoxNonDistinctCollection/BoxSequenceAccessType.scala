package com.dslplatform.ocd
package types
package box

trait BoxSequenceAccessType
    extends BoxNonDistinctCollectionType {

  def isRandomAccess: Boolean
}

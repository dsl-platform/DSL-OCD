package com.dslplatform.ocd
package types
package box

trait BoxNonNullableType
    extends BoxNullnessType {

  def isNullable = false
}

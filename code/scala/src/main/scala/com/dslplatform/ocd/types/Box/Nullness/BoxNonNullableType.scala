package com.dslplatform.ocd

trait BoxNonNullableType extends BoxNullnessType {
  def isNullable = false
}

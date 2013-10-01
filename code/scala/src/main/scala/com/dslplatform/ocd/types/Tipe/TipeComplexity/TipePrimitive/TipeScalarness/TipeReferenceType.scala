package com.dslplatform.ocd
/**
 * can be null, but can be compared with = (eg. Integer)
 */
trait TipeReferenceType extends TipeScalarnessType {
  def isScalar = false
}

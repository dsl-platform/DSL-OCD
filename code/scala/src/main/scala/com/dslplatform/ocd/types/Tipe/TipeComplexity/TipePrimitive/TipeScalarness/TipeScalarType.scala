package com.dslplatform.ocd

/**
 * cannot be set to null, cannot be compared using equals -  also called primitives in java
 */
trait TipeScalarType extends TipeScalarnessType {
  def isScalar = true
}

package com.dslplatform.ocd
/**
 * cannot be compared using =, can be null - must be compared via .equals
 */
trait TipeComplexType extends TipeComplexityType {
  def isComplex = true
}

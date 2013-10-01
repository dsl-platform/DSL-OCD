package com.dslplatform.ocd.types.Tipe.TipeComplexity.TipeComplex.TipeEqualness

import com.dslplatform.ocd.types.Tipe.TipeComplexity.TipeComplex.TipeEqualnessType
/**
 * can be null, but can be compared with = (eg. Integer)
 */
trait TipeEqualsType extends TipeEqualnessType {
  def canBeComparedUsingEquals = true
}

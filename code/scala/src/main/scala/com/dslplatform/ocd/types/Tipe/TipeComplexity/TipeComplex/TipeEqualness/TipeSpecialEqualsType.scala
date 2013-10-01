package com.dslplatform.ocd.types.Tipe.TipeComplexity.TipeComplex.TipeEqualness

import com.dslplatform.ocd.types.Tipe.TipeComplexity.TipeComplex.TipeEqualnessType

trait TipeSpecialEqualsType extends TipeEqualnessType {
  def canBeComparedUsingEquals = false
}
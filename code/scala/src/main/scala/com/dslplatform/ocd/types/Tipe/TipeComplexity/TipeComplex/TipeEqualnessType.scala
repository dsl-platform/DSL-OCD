package com.dslplatform.ocd.types.Tipe.TipeComplexity.TipeComplex


import com.dslplatform.ocd.TipeComplexType

trait TipeEqualnessType extends TipeComplexType {
  def canBeComparedUsingEquals: Boolean
}

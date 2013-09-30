package com.dslplatform.ocd

trait DslNonSurrogateAggregateRootType extends DslAggregateRootType {
  def hasSurrogateIdentity = false
}

package com.dslplatform.ocd
package types

trait DslNonSurrogateAggregateRootType
    extends DslAggregateRootType {

  def hasSurrogateIdentity = false
}

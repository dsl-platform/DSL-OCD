package com.dslplatform.ocd

trait DslNonIdentifiableType extends DslIdentifiablenessType {
  def isIdentifiable = false
}

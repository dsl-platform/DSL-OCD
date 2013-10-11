package com.dslplatform.ocd
package types

trait DslNonIdentifiableType
    extends DslIdentifiablenessType {

  def isIdentifiable = false
}

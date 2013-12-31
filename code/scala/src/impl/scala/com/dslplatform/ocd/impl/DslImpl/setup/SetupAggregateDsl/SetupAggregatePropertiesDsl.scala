package com.dslplatform.ocd
package impl
package dsl
package setup

import types._

trait SetupAggregatePropertiesDsl
    extends SetupDsl
    with SetupAggregatePropertiesType {

  def ModuleName: String
  def AggregateName: String

  def primaryKey: String
  def aggregateProperties: Seq[DslPropertyStub]

  def dslTemplate =
    module (ModuleName) {
      root (AggregateName)(primaryKey) {
        aggregateProperties: _*
      }
    }
}

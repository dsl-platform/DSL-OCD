package com.dslplatform.ocd
package impl
package dsl
package setup

import types._

trait SetupSinglePropertyInAggregateDsl
    extends SetupAggregatePropertiesDsl
    with SetupSinglePropertyInAggregateType {

  def ModuleName = PropertyName + "InAggregate"
  def AggregateName = PropertyName + "Aggregate"

  def propertyType: DslImpl
  def PropertyName = propertyType.boxDesc + propertyType.dslDesc
  def propertyName = PropertyName.fcil

  def primaryKey = propertyName
  def property: DslPropertyStub = propertyType -> propertyName

  def aggregateProperties = Seq(property)

  def setupDesc = "SetupSinglePropertyInAggregateDsl: " + PropertyName
}

package com.dslplatform.ocd
package impl
package dsl
package setup

import types._

trait SetupSinglePropertyWithSurrogateInAggregateDsl
    extends SetupAggregatePropertiesDsl
    with SetupSinglePropertyWithSurrogateInAggregateType {

  def ModuleName = PropertyName + "WithSurrogateInAggregate"
  def AggregateName = PropertyName + "WithSurrogateAggregate"

  def propertyType: DslImpl
  def PropertyName = propertyType.boxDesc + propertyType.dslDesc
  def propertyName = PropertyName.fcil

  def primaryKey = "ID"
  def property: DslPropertyStub = propertyType -> propertyName

  def aggregateProperties = Seq(
    ("Int" -> "ID") { Sequence }
  , property
  )

  def setupDesc = "SetupSinglePropertyWithSurrogateInAggregateDsl: " + PropertyName
}

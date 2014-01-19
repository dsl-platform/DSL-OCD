package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneGuid_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneGuid: java.util.UUID = java.util.UUID.randomUUID,
     calculatedOneGuid: java.util.UUID = java.util.UUID.randomUUID,
     persistedOneGuid: java.util.UUID = java.util.UUID.randomUUID
  ) {

    require(oneGuid ne null, "Null value was provided for property \"oneGuid\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneGuid") oneGuid: java.util.UUID
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneGuid") calculatedOneGuid: java.util.UUID
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneGuid") persistedOneGuid: java.util.UUID
  ) =
    this( oneGuid = if (oneGuid == null) java.util.UUID.randomUUID else oneGuid, calculatedOneGuid = if (calculatedOneGuid == null) java.util.UUID.randomUUID else calculatedOneGuid, persistedOneGuid = if (persistedOneGuid == null) java.util.UUID.randomUUID else persistedOneGuid)

}

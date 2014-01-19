package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableGuid_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableGuid: Option[java.util.UUID] = None,
     calculatedNullableGuid: Option[java.util.UUID] = None,
     persistedNullableGuid: Option[java.util.UUID] = None
  ) {

    require(nullableGuid ne null, "Null value was provided for property \"nullableGuid\"")
    if (nullableGuid.isDefined) require(nullableGuid.get ne null, "Null value was provided for property \"nullableGuid\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableGuid") nullableGuid: Option[java.util.UUID]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableGuid") calculatedNullableGuid: Option[java.util.UUID]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableGuid") persistedNullableGuid: Option[java.util.UUID]
  ) =
    this( nullableGuid = nullableGuid, calculatedNullableGuid = calculatedNullableGuid, persistedNullableGuid = persistedNullableGuid)

}

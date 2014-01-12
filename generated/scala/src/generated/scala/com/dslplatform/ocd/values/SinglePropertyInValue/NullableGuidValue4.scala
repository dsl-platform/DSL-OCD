package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableGuidValue4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableGuid: Option[java.util.UUID] = None
  ) {

    require(nullableGuid ne null, "Null value was provided for property \"nullableGuid\"")
    if (nullableGuid.isDefined) require(nullableGuid.get ne null, "Null value was provided for property \"nullableGuid\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableGuid") nullableGuid: Option[java.util.UUID]
  ) =
    this( nullableGuid = nullableGuid)

}

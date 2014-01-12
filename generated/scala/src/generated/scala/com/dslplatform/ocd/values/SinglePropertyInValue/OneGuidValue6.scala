package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneGuidValue6 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneGuid: java.util.UUID = java.util.UUID.randomUUID
  ) {

    require(oneGuid ne null, "Null value was provided for property \"oneGuid\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneGuid") oneGuid: java.util.UUID
  ) =
    this( oneGuid = if (oneGuid == null) java.util.UUID.randomUUID else oneGuid)

}

package com.dslplatform.ocd.values.PropertyInValue

case class OneSetOfNullableIps_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfNullableIps: Set[Option[java.net.InetAddress]] = Set.empty
  ) {

    require(oneSetOfNullableIps ne null, "Null value was provided for property \"oneSetOfNullableIps\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableIps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableIps") oneSetOfNullableIps: Set[Option[java.net.InetAddress]]
  ) =
    this( oneSetOfNullableIps = if (oneSetOfNullableIps == null) Set.empty else oneSetOfNullableIps)

}

package com.dslplatform.ocd.values.PropertyInValue

case class OneSetOfOneIps_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfOneIps: Set[java.net.InetAddress] = Set.empty
  ) {

    require(oneSetOfOneIps ne null, "Null value was provided for property \"oneSetOfOneIps\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneIps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneIps") oneSetOfOneIps: Set[java.net.InetAddress]
  ) =
    this( oneSetOfOneIps = if (oneSetOfOneIps == null) Set.empty else oneSetOfOneIps)

}

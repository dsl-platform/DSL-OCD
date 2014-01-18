package com.dslplatform.ocd.values.PropertyInValue

case class NullableListOfNullableIps_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfNullableIps: Option[IndexedSeq[Option[java.net.InetAddress]]] = None
  ) {

    require(nullableListOfNullableIps ne null, "Null value was provided for property \"nullableListOfNullableIps\"")
    if (nullableListOfNullableIps.isDefined) require(nullableListOfNullableIps.get ne null, "Null value was provided for property \"nullableListOfNullableIps\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableIps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableIps") nullableListOfNullableIps: Option[IndexedSeq[Option[java.net.InetAddress]]]
  ) =
    this( nullableListOfNullableIps = nullableListOfNullableIps)

}

package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableListOfOneIps_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfOneIps: Option[IndexedSeq[java.net.InetAddress]] = None,
     calculatedNullableListOfOneIps: Option[IndexedSeq[java.net.InetAddress]] = None,
     persistedNullableListOfOneIps: Option[IndexedSeq[java.net.InetAddress]] = None
  ) {

    require(nullableListOfOneIps ne null, "Null value was provided for property \"nullableListOfOneIps\"")
    if (nullableListOfOneIps.isDefined) require(nullableListOfOneIps.get ne null, "Null value was provided for property \"nullableListOfOneIps\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneIps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneIps") nullableListOfOneIps: Option[IndexedSeq[java.net.InetAddress]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneIps") calculatedNullableListOfOneIps: Option[IndexedSeq[java.net.InetAddress]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneIps") persistedNullableListOfOneIps: Option[IndexedSeq[java.net.InetAddress]]
  ) =
    this( nullableListOfOneIps = nullableListOfOneIps, calculatedNullableListOfOneIps = calculatedNullableListOfOneIps, persistedNullableListOfOneIps = persistedNullableListOfOneIps)

}

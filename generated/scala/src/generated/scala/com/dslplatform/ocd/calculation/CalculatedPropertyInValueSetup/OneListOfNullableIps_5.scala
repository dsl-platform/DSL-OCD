package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneListOfNullableIps_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfNullableIps: IndexedSeq[Option[java.net.InetAddress]] = IndexedSeq.empty,
     calculatedOneListOfNullableIps: IndexedSeq[Option[java.net.InetAddress]] = IndexedSeq.empty,
     persistedOneListOfNullableIps: IndexedSeq[Option[java.net.InetAddress]] = IndexedSeq.empty
  ) {

    require(oneListOfNullableIps ne null, "Null value was provided for property \"oneListOfNullableIps\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableIps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableIps") oneListOfNullableIps: IndexedSeq[Option[java.net.InetAddress]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullableIps") calculatedOneListOfNullableIps: IndexedSeq[Option[java.net.InetAddress]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullableIps") persistedOneListOfNullableIps: IndexedSeq[Option[java.net.InetAddress]]
  ) =
    this( oneListOfNullableIps = if (oneListOfNullableIps == null) IndexedSeq.empty else oneListOfNullableIps, calculatedOneListOfNullableIps = calculatedOneListOfNullableIps, persistedOneListOfNullableIps = persistedOneListOfNullableIps)

}

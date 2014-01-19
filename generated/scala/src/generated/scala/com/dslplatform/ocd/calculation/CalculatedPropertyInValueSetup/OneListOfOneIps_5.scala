package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneListOfOneIps_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfOneIps: IndexedSeq[java.net.InetAddress] = IndexedSeq.empty,
     calculatedOneListOfOneIps: IndexedSeq[java.net.InetAddress] = IndexedSeq.empty,
     persistedOneListOfOneIps: IndexedSeq[java.net.InetAddress] = IndexedSeq.empty
  ) {

    require(oneListOfOneIps ne null, "Null value was provided for property \"oneListOfOneIps\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneIps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneIps") oneListOfOneIps: IndexedSeq[java.net.InetAddress]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfOneIps") calculatedOneListOfOneIps: IndexedSeq[java.net.InetAddress]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfOneIps") persistedOneListOfOneIps: IndexedSeq[java.net.InetAddress]
  ) =
    this( oneListOfOneIps = if (oneListOfOneIps == null) IndexedSeq.empty else oneListOfOneIps, calculatedOneListOfOneIps = calculatedOneListOfOneIps, persistedOneListOfOneIps = persistedOneListOfOneIps)

}

package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneArrayOfOneTimestamps_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfOneTimestamps: Array[org.joda.time.DateTime] = Array.empty,
     calculatedOneArrayOfOneTimestamps: Array[org.joda.time.DateTime] = Array.empty,
     persistedOneArrayOfOneTimestamps: Array[org.joda.time.DateTime] = Array.empty
  ) {

    require(oneArrayOfOneTimestamps ne null, "Null value was provided for property \"oneArrayOfOneTimestamps\"")
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneTimestamps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneTimestamps") oneArrayOfOneTimestamps: Array[org.joda.time.DateTime]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneTimestamps") calculatedOneArrayOfOneTimestamps: Array[org.joda.time.DateTime]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneTimestamps") persistedOneArrayOfOneTimestamps: Array[org.joda.time.DateTime]
  ) =
    this( oneArrayOfOneTimestamps = if (oneArrayOfOneTimestamps == null) Array.empty else oneArrayOfOneTimestamps, calculatedOneArrayOfOneTimestamps = calculatedOneArrayOfOneTimestamps, persistedOneArrayOfOneTimestamps = persistedOneArrayOfOneTimestamps)

}

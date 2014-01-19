package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneSetOfOneTimestamps_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfOneTimestamps: Set[org.joda.time.DateTime] = Set.empty,
     calculatedOneSetOfOneTimestamps: Set[org.joda.time.DateTime] = Set.empty,
     persistedOneSetOfOneTimestamps: Set[org.joda.time.DateTime] = Set.empty
  ) {

    require(oneSetOfOneTimestamps ne null, "Null value was provided for property \"oneSetOfOneTimestamps\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneTimestamps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneTimestamps") oneSetOfOneTimestamps: Set[org.joda.time.DateTime]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneTimestamps") calculatedOneSetOfOneTimestamps: Set[org.joda.time.DateTime]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneTimestamps") persistedOneSetOfOneTimestamps: Set[org.joda.time.DateTime]
  ) =
    this( oneSetOfOneTimestamps = if (oneSetOfOneTimestamps == null) Set.empty else oneSetOfOneTimestamps, calculatedOneSetOfOneTimestamps = calculatedOneSetOfOneTimestamps, persistedOneSetOfOneTimestamps = persistedOneSetOfOneTimestamps)

}

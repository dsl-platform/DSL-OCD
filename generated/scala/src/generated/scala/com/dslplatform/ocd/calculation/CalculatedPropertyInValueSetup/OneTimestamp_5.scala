package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneTimestamp_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneTimestamp: org.joda.time.DateTime = org.joda.time.DateTime.now,
     calculatedOneTimestamp: org.joda.time.DateTime = org.joda.time.DateTime.now,
     persistedOneTimestamp: org.joda.time.DateTime = org.joda.time.DateTime.now
  ) {

    require(oneTimestamp ne null, "Null value was provided for property \"oneTimestamp\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneTimestamp") oneTimestamp: org.joda.time.DateTime
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneTimestamp") calculatedOneTimestamp: org.joda.time.DateTime
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneTimestamp") persistedOneTimestamp: org.joda.time.DateTime
  ) =
    this( oneTimestamp = if (oneTimestamp == null) org.joda.time.DateTime.now else oneTimestamp, calculatedOneTimestamp = if (calculatedOneTimestamp == null) org.joda.time.DateTime.now else calculatedOneTimestamp, persistedOneTimestamp = if (persistedOneTimestamp == null) org.joda.time.DateTime.now else persistedOneTimestamp)

}

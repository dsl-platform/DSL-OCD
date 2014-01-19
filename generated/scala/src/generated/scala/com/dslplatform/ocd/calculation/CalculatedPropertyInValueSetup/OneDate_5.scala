package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneDate_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneDate: org.joda.time.LocalDate = org.joda.time.LocalDate.now,
     calculatedOneDate: org.joda.time.LocalDate = org.joda.time.LocalDate.now,
     persistedOneDate: org.joda.time.LocalDate = org.joda.time.LocalDate.now
  ) {

    require(oneDate ne null, "Null value was provided for property \"oneDate\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneDate") oneDate: org.joda.time.LocalDate
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneDate") calculatedOneDate: org.joda.time.LocalDate
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneDate") persistedOneDate: org.joda.time.LocalDate
  ) =
    this( oneDate = if (oneDate == null) org.joda.time.LocalDate.now else oneDate, calculatedOneDate = if (calculatedOneDate == null) org.joda.time.LocalDate.now else calculatedOneDate, persistedOneDate = if (persistedOneDate == null) org.joda.time.LocalDate.now else persistedOneDate)

}

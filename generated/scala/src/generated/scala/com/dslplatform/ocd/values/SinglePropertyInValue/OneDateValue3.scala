package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneDateValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneDate: org.joda.time.LocalDate = org.joda.time.LocalDate.now
  ) {

    require(oneDate ne null, "Null value was provided for property \"oneDate\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneDate") oneDate: org.joda.time.LocalDate
  ) =
    this( oneDate = if (oneDate == null) org.joda.time.LocalDate.now else oneDate)

}

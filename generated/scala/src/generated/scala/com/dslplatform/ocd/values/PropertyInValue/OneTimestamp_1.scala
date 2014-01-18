package com.dslplatform.ocd.values.PropertyInValue

case class OneTimestamp_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneTimestamp: org.joda.time.DateTime = org.joda.time.DateTime.now
  ) {

    require(oneTimestamp ne null, "Null value was provided for property \"oneTimestamp\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneTimestamp") oneTimestamp: org.joda.time.DateTime
  ) =
    this( oneTimestamp = if (oneTimestamp == null) org.joda.time.DateTime.now else oneTimestamp)

}

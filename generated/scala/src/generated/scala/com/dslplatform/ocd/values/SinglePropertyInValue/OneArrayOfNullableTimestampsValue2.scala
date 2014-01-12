package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneArrayOfNullableTimestampsValue2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfNullableTimestamps: Array[Option[org.joda.time.DateTime]] = Array.empty
  ) {

    require(oneArrayOfNullableTimestamps ne null, "Null value was provided for property \"oneArrayOfNullableTimestamps\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableTimestamps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableTimestamps") oneArrayOfNullableTimestamps: Array[Option[org.joda.time.DateTime]]
  ) =
    this( oneArrayOfNullableTimestamps = if (oneArrayOfNullableTimestamps == null) Array.empty else oneArrayOfNullableTimestamps)

}

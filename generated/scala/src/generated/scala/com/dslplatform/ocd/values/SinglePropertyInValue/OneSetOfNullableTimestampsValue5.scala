package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneSetOfNullableTimestampsValue5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfNullableTimestamps: Set[Option[org.joda.time.DateTime]] = Set.empty
  ) {

    require(oneSetOfNullableTimestamps ne null, "Null value was provided for property \"oneSetOfNullableTimestamps\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableTimestamps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableTimestamps") oneSetOfNullableTimestamps: Set[Option[org.joda.time.DateTime]]
  ) =
    this( oneSetOfNullableTimestamps = if (oneSetOfNullableTimestamps == null) Set.empty else oneSetOfNullableTimestamps)

}

package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableArrayOfNullableTimestampsValue7 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfNullableTimestamps: Option[Array[Option[org.joda.time.DateTime]]] = None
  ) {

    require(nullableArrayOfNullableTimestamps ne null, "Null value was provided for property \"nullableArrayOfNullableTimestamps\"")
    if (nullableArrayOfNullableTimestamps.isDefined) require(nullableArrayOfNullableTimestamps.get ne null, "Null value was provided for property \"nullableArrayOfNullableTimestamps\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableTimestamps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableTimestamps") nullableArrayOfNullableTimestamps: Option[Array[Option[org.joda.time.DateTime]]]
  ) =
    this( nullableArrayOfNullableTimestamps = nullableArrayOfNullableTimestamps)

}

package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableArrayOfNullableBooleans_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableArrayOfNullableBooleans: Option[Array[Option[Boolean]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableBooleans") nullableArrayOfNullableBooleans: Option[Array[Option[Boolean]]]
  ) =
    this(URI = URI, nullableArrayOfNullableBooleans = nullableArrayOfNullableBooleans)

}

object NullableArrayOfNullableBooleans_5Grid

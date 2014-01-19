package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableArrayOfNullableIntegers_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableArrayOfNullableIntegers: Option[Array[Option[Int]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableIntegers") nullableArrayOfNullableIntegers: Option[Array[Option[Int]]]
  ) =
    this(URI = URI, nullableArrayOfNullableIntegers = nullableArrayOfNullableIntegers)

}

object NullableArrayOfNullableIntegers_5Grid

package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableArrayOfNullableDoubles_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableArrayOfNullableDoubles: Option[Array[Option[Double]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableDoubles") nullableArrayOfNullableDoubles: Option[Array[Option[Double]]]
  ) =
    this(URI = URI, nullableArrayOfNullableDoubles = nullableArrayOfNullableDoubles)

}

object NullableArrayOfNullableDoubles_5Grid

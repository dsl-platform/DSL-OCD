package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableArrayOfNullableMonies_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableArrayOfNullableMonies: Option[Array[Option[BigDecimal]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableMonies") nullableArrayOfNullableMonies: Option[Array[Option[BigDecimal]]]
  ) =
    this(URI = URI, nullableArrayOfNullableMonies = nullableArrayOfNullableMonies)

}

object NullableArrayOfNullableMonies_5Grid

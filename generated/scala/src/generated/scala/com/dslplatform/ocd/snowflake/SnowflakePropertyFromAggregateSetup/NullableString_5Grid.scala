package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableString_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableString: Option[String]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableString") nullableString: Option[String]
  ) =
    this(URI = URI, nullableString = nullableString)

}

object NullableString_5Grid

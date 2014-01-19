package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableUrl_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableUrl: Option[java.net.URI]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableUrl") nullableUrl: Option[java.net.URI]
  ) =
    this(URI = URI, nullableUrl = nullableUrl)

}

object NullableUrl_5Grid

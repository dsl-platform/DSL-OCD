package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneUrl_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneUrl: java.net.URI
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneUrl") oneUrl: java.net.URI
  ) =
    this(URI = URI, oneUrl = if (oneUrl == null) null else oneUrl)

}

object OneUrl_6Grid

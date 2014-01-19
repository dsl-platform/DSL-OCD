package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneArrayOfOneUrls_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneArrayOfOneUrls: Array[java.net.URI]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneUrls") oneArrayOfOneUrls: Array[java.net.URI]
  ) =
    this(URI = URI, oneArrayOfOneUrls = if (oneArrayOfOneUrls == null) Array.empty else oneArrayOfOneUrls)

}

object OneArrayOfOneUrls_6Grid

package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneArrayOfNullableUrls_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneArrayOfNullableUrls: Array[Option[java.net.URI]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableUrls") oneArrayOfNullableUrls: Array[Option[java.net.URI]]
  ) =
    this(URI = URI, oneArrayOfNullableUrls = if (oneArrayOfNullableUrls == null) Array.empty else oneArrayOfNullableUrls)

}

object OneArrayOfNullableUrls_6Grid

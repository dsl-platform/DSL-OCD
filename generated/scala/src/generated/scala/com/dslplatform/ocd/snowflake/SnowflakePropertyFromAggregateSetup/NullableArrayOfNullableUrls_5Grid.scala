package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableArrayOfNullableUrls_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableArrayOfNullableUrls: Option[Array[Option[java.net.URI]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableUrls") nullableArrayOfNullableUrls: Option[Array[Option[java.net.URI]]]
  ) =
    this(URI = URI, nullableArrayOfNullableUrls = nullableArrayOfNullableUrls)

}

object NullableArrayOfNullableUrls_5Grid

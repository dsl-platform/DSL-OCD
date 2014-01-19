package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableSetOfNullableUrls_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableSetOfNullableUrls: Option[Set[Option[java.net.URI]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableUrls") nullableSetOfNullableUrls: Option[Set[Option[java.net.URI]]]
  ) =
    this(URI = URI, nullableSetOfNullableUrls = nullableSetOfNullableUrls)

}

object NullableSetOfNullableUrls_5Grid

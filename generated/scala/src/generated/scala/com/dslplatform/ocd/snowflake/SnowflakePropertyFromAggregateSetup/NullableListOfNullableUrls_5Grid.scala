package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableListOfNullableUrls_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableListOfNullableUrls: Option[IndexedSeq[Option[java.net.URI]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableUrls") nullableListOfNullableUrls: Option[IndexedSeq[Option[java.net.URI]]]
  ) =
    this(URI = URI, nullableListOfNullableUrls = nullableListOfNullableUrls)

}

object NullableListOfNullableUrls_5Grid

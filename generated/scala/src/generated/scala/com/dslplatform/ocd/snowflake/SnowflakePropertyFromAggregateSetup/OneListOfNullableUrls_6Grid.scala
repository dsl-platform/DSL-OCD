package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneListOfNullableUrls_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneListOfNullableUrls: IndexedSeq[Option[java.net.URI]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableUrls") oneListOfNullableUrls: IndexedSeq[Option[java.net.URI]]
  ) =
    this(URI = URI, oneListOfNullableUrls = if (oneListOfNullableUrls == null) IndexedSeq.empty else oneListOfNullableUrls)

}

object OneListOfNullableUrls_6Grid

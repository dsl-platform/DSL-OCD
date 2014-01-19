package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableSetOfOneUrls_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableSetOfOneUrls: Option[Set[java.net.URI]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneUrls") nullableSetOfOneUrls: Option[Set[java.net.URI]]
  ) =
    this(URI = URI, nullableSetOfOneUrls = nullableSetOfOneUrls)

}

object NullableSetOfOneUrls_5Grid

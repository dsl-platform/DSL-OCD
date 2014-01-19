package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneArrayOfNullableBinaries_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneArrayOfNullableBinaries: Array[Option[Array[Byte]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableBinaries") oneArrayOfNullableBinaries: Array[Option[Array[Byte]]]
  ) =
    this(URI = URI, oneArrayOfNullableBinaries = if (oneArrayOfNullableBinaries == null) Array.empty else oneArrayOfNullableBinaries)

}

object OneArrayOfNullableBinaries_6Grid

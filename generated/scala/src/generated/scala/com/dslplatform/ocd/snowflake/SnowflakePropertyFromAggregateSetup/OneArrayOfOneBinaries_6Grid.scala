package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneArrayOfOneBinaries_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneArrayOfOneBinaries: Array[Array[Byte]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneBinaries") oneArrayOfOneBinaries: Array[Array[Byte]]
  ) =
    this(URI = URI, oneArrayOfOneBinaries = if (oneArrayOfOneBinaries == null) Array.empty else oneArrayOfOneBinaries)

}

object OneArrayOfOneBinaries_6Grid

package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneArrayOfOneGuids_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneArrayOfOneGuids: Array[java.util.UUID]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneGuids") oneArrayOfOneGuids: Array[java.util.UUID]
  ) =
    this(URI = URI, oneArrayOfOneGuids = if (oneArrayOfOneGuids == null) Array.empty else oneArrayOfOneGuids)

}

object OneArrayOfOneGuids_6Grid

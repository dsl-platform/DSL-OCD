package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneArrayOfNullableGuids_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneArrayOfNullableGuids: Array[Option[java.util.UUID]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableGuids") oneArrayOfNullableGuids: Array[Option[java.util.UUID]]
  ) =
    this(URI = URI, oneArrayOfNullableGuids = if (oneArrayOfNullableGuids == null) Array.empty else oneArrayOfNullableGuids)

}

object OneArrayOfNullableGuids_6Grid

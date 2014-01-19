package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneSetOfNullableGuids_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneSetOfNullableGuids: Set[Option[java.util.UUID]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableGuids") oneSetOfNullableGuids: Set[Option[java.util.UUID]]
  ) =
    this(URI = URI, oneSetOfNullableGuids = if (oneSetOfNullableGuids == null) Set.empty else oneSetOfNullableGuids)

}

object OneSetOfNullableGuids_6Grid

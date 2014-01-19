package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneSetOfOneGuids_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneSetOfOneGuids: Set[java.util.UUID]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneGuids") oneSetOfOneGuids: Set[java.util.UUID]
  ) =
    this(URI = URI, oneSetOfOneGuids = if (oneSetOfOneGuids == null) Set.empty else oneSetOfOneGuids)

}

object OneSetOfOneGuids_6Grid

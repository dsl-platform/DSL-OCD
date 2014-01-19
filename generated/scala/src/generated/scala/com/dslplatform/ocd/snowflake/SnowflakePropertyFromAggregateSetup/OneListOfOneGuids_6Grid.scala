package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneListOfOneGuids_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneListOfOneGuids: IndexedSeq[java.util.UUID]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneGuids") oneListOfOneGuids: IndexedSeq[java.util.UUID]
  ) =
    this(URI = URI, oneListOfOneGuids = if (oneListOfOneGuids == null) IndexedSeq.empty else oneListOfOneGuids)

}

object OneListOfOneGuids_6Grid

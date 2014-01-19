package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneListOfNullableGuids_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneListOfNullableGuids: IndexedSeq[Option[java.util.UUID]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableGuids") oneListOfNullableGuids: IndexedSeq[Option[java.util.UUID]]
  ) =
    this(URI = URI, oneListOfNullableGuids = if (oneListOfNullableGuids == null) IndexedSeq.empty else oneListOfNullableGuids)

}

object OneListOfNullableGuids_6Grid
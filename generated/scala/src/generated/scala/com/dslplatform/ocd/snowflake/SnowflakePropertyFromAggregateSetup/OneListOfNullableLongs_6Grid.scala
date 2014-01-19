package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneListOfNullableLongs_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneListOfNullableLongs: IndexedSeq[Option[Long]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableLongs") oneListOfNullableLongs: IndexedSeq[Option[Long]]
  ) =
    this(URI = URI, oneListOfNullableLongs = if (oneListOfNullableLongs == null) IndexedSeq.empty else oneListOfNullableLongs)

}

object OneListOfNullableLongs_6Grid

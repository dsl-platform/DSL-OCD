package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneListOfOneLongs_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneListOfOneLongs: IndexedSeq[Long]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneLongs") oneListOfOneLongs: IndexedSeq[Long]
  ) =
    this(URI = URI, oneListOfOneLongs = if (oneListOfOneLongs == null) IndexedSeq.empty else oneListOfOneLongs)

}

object OneListOfOneLongs_6Grid

package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneListOfOneBinaries_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneListOfOneBinaries: IndexedSeq[Array[Byte]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneBinaries") oneListOfOneBinaries: IndexedSeq[Array[Byte]]
  ) =
    this(URI = URI, oneListOfOneBinaries = if (oneListOfOneBinaries == null) IndexedSeq.empty else oneListOfOneBinaries)

}

object OneListOfOneBinaries_6Grid

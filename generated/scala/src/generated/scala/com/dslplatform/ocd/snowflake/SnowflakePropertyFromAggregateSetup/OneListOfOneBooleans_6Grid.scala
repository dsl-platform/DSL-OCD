package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneListOfOneBooleans_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneListOfOneBooleans: IndexedSeq[Boolean]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneBooleans") oneListOfOneBooleans: IndexedSeq[Boolean]
  ) =
    this(URI = URI, oneListOfOneBooleans = if (oneListOfOneBooleans == null) IndexedSeq.empty else oneListOfOneBooleans)

}

object OneListOfOneBooleans_6Grid

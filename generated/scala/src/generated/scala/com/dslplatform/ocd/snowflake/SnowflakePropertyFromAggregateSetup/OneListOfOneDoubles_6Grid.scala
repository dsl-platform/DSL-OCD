package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneListOfOneDoubles_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneListOfOneDoubles: IndexedSeq[Double]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneDoubles") oneListOfOneDoubles: IndexedSeq[Double]
  ) =
    this(URI = URI, oneListOfOneDoubles = if (oneListOfOneDoubles == null) IndexedSeq.empty else oneListOfOneDoubles)

}

object OneListOfOneDoubles_6Grid

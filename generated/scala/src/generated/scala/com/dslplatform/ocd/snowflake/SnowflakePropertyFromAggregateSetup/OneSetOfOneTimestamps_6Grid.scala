package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneSetOfOneTimestamps_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneSetOfOneTimestamps: Set[org.joda.time.DateTime]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneTimestamps") oneSetOfOneTimestamps: Set[org.joda.time.DateTime]
  ) =
    this(URI = URI, oneSetOfOneTimestamps = if (oneSetOfOneTimestamps == null) Set.empty else oneSetOfOneTimestamps)

}

object OneSetOfOneTimestamps_6Grid

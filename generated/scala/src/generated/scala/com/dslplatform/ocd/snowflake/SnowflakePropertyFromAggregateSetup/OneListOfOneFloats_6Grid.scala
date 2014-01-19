package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneListOfOneFloats_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneListOfOneFloats: IndexedSeq[Float]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneFloats") oneListOfOneFloats: IndexedSeq[Float]
  ) =
    this(URI = URI, oneListOfOneFloats = if (oneListOfOneFloats == null) IndexedSeq.empty else oneListOfOneFloats)

}

object OneListOfOneFloats_6Grid

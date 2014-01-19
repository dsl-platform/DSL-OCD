package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneListOfNullableFloats_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneListOfNullableFloats: IndexedSeq[Option[Float]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableFloats") oneListOfNullableFloats: IndexedSeq[Option[Float]]
  ) =
    this(URI = URI, oneListOfNullableFloats = if (oneListOfNullableFloats == null) IndexedSeq.empty else oneListOfNullableFloats)

}

object OneListOfNullableFloats_6Grid

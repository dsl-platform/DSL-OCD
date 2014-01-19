package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneListOfNullableBooleans_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneListOfNullableBooleans: IndexedSeq[Option[Boolean]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableBooleans") oneListOfNullableBooleans: IndexedSeq[Option[Boolean]]
  ) =
    this(URI = URI, oneListOfNullableBooleans = if (oneListOfNullableBooleans == null) IndexedSeq.empty else oneListOfNullableBooleans)

}

object OneListOfNullableBooleans_6Grid

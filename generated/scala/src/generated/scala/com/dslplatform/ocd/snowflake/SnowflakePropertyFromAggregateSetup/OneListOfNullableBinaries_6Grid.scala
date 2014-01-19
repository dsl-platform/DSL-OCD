package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneListOfNullableBinaries_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneListOfNullableBinaries: IndexedSeq[Option[Array[Byte]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableBinaries") oneListOfNullableBinaries: IndexedSeq[Option[Array[Byte]]]
  ) =
    this(URI = URI, oneListOfNullableBinaries = if (oneListOfNullableBinaries == null) IndexedSeq.empty else oneListOfNullableBinaries)

}

object OneListOfNullableBinaries_6Grid

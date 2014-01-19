package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneSetOfNullableBinaries_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneSetOfNullableBinaries: Set[Option[Array[Byte]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableBinaries") oneSetOfNullableBinaries: Set[Option[Array[Byte]]]
  ) =
    this(URI = URI, oneSetOfNullableBinaries = if (oneSetOfNullableBinaries == null) Set.empty else oneSetOfNullableBinaries)

}

object OneSetOfNullableBinaries_6Grid

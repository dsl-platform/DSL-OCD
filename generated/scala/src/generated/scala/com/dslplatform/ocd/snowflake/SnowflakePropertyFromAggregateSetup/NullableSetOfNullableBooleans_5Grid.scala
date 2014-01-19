package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableSetOfNullableBooleans_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableSetOfNullableBooleans: Option[Set[Option[Boolean]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableBooleans") nullableSetOfNullableBooleans: Option[Set[Option[Boolean]]]
  ) =
    this(URI = URI, nullableSetOfNullableBooleans = nullableSetOfNullableBooleans)

}

object NullableSetOfNullableBooleans_5Grid

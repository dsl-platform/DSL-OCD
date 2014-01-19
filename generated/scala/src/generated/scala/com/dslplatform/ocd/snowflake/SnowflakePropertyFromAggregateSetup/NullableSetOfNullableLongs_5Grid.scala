package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableSetOfNullableLongs_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableSetOfNullableLongs: Option[Set[Option[Long]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableLongs") nullableSetOfNullableLongs: Option[Set[Option[Long]]]
  ) =
    this(URI = URI, nullableSetOfNullableLongs = nullableSetOfNullableLongs)

}

object NullableSetOfNullableLongs_5Grid

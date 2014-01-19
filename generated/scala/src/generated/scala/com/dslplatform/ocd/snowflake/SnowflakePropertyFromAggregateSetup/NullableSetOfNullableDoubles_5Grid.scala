package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableSetOfNullableDoubles_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableSetOfNullableDoubles: Option[Set[Option[Double]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableDoubles") nullableSetOfNullableDoubles: Option[Set[Option[Double]]]
  ) =
    this(URI = URI, nullableSetOfNullableDoubles = nullableSetOfNullableDoubles)

}

object NullableSetOfNullableDoubles_5Grid

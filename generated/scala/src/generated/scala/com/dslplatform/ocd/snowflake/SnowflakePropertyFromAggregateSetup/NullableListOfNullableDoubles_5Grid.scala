package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableListOfNullableDoubles_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableListOfNullableDoubles: Option[IndexedSeq[Option[Double]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableDoubles") nullableListOfNullableDoubles: Option[IndexedSeq[Option[Double]]]
  ) =
    this(URI = URI, nullableListOfNullableDoubles = nullableListOfNullableDoubles)

}

object NullableListOfNullableDoubles_5Grid

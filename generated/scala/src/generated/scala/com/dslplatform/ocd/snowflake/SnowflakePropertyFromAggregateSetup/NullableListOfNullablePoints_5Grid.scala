package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableListOfNullablePoints_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableListOfNullablePoints: Option[IndexedSeq[Option[java.awt.geom.Point2D]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullablePoints") nullableListOfNullablePoints: Option[IndexedSeq[Option[java.awt.geom.Point2D]]]
  ) =
    this(URI = URI, nullableListOfNullablePoints = nullableListOfNullablePoints)

}

object NullableListOfNullablePoints_5Grid

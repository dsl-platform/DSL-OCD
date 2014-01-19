package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableListOfNullableImages_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableListOfNullableImages: Option[IndexedSeq[Option[java.awt.image.BufferedImage]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableImages") nullableListOfNullableImages: Option[IndexedSeq[Option[java.awt.image.BufferedImage]]]
  ) =
    this(URI = URI, nullableListOfNullableImages = nullableListOfNullableImages)

}

object NullableListOfNullableImages_5Grid

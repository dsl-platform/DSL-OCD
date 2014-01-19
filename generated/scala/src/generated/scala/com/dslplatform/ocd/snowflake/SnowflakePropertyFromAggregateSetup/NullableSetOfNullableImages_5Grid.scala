package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableSetOfNullableImages_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableSetOfNullableImages: Option[Set[Option[java.awt.image.BufferedImage]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableImages") nullableSetOfNullableImages: Option[Set[Option[java.awt.image.BufferedImage]]]
  ) =
    this(URI = URI, nullableSetOfNullableImages = nullableSetOfNullableImages)

}

object NullableSetOfNullableImages_5Grid

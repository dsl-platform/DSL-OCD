package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneArrayOfNullableImages_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneArrayOfNullableImages: Array[Option[java.awt.image.BufferedImage]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableImages") oneArrayOfNullableImages: Array[Option[java.awt.image.BufferedImage]]
  ) =
    this(URI = URI, oneArrayOfNullableImages = if (oneArrayOfNullableImages == null) Array.empty else oneArrayOfNullableImages)

}

object OneArrayOfNullableImages_6Grid

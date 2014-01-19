package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneArrayOfOneImages_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneArrayOfOneImages: Array[java.awt.image.BufferedImage]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneImages") oneArrayOfOneImages: Array[java.awt.image.BufferedImage]
  ) =
    this(URI = URI, oneArrayOfOneImages = if (oneArrayOfOneImages == null) Array.empty else oneArrayOfOneImages)

}

object OneArrayOfOneImages_6Grid

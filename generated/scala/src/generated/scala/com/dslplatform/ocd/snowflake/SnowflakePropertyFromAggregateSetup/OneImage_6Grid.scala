package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneImage_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneImage: java.awt.image.BufferedImage
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneImage") oneImage: java.awt.image.BufferedImage
  ) =
    this(URI = URI, oneImage = if (oneImage == null) new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR) else oneImage)

}

object OneImage_6Grid

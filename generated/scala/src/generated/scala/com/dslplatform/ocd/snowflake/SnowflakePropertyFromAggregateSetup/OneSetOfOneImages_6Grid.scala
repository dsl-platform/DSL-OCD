package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneSetOfOneImages_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneSetOfOneImages: Set[java.awt.image.BufferedImage]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneImages") oneSetOfOneImages: Set[java.awt.image.BufferedImage]
  ) =
    this(URI = URI, oneSetOfOneImages = if (oneSetOfOneImages == null) Set.empty else oneSetOfOneImages)

}

object OneSetOfOneImages_6Grid

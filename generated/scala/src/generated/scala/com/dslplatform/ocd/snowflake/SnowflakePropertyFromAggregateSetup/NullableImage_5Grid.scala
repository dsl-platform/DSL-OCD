package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableImage_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableImage: Option[java.awt.image.BufferedImage]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableImage") nullableImage: Option[java.awt.image.BufferedImage]
  ) =
    this(URI = URI, nullableImage = nullableImage)

}

object NullableImage_5Grid

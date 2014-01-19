package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableArrayOfOneImages_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableArrayOfOneImages: Option[Array[java.awt.image.BufferedImage]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneImages") nullableArrayOfOneImages: Option[Array[java.awt.image.BufferedImage]]
  ) =
    this(URI = URI, nullableArrayOfOneImages = nullableArrayOfOneImages)

}

object NullableArrayOfOneImages_5Grid

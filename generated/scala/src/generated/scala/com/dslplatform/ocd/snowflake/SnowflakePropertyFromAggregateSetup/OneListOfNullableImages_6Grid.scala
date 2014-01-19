package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneListOfNullableImages_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneListOfNullableImages: IndexedSeq[Option[java.awt.image.BufferedImage]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableImages") oneListOfNullableImages: IndexedSeq[Option[java.awt.image.BufferedImage]]
  ) =
    this(URI = URI, oneListOfNullableImages = if (oneListOfNullableImages == null) IndexedSeq.empty else oneListOfNullableImages)

}

object OneListOfNullableImages_6Grid

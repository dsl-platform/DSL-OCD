package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneArrayOfNullableTexts_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneArrayOfNullableTexts: Array[Option[String]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableTexts") oneArrayOfNullableTexts: Array[Option[String]]
  ) =
    this(URI = URI, oneArrayOfNullableTexts = if (oneArrayOfNullableTexts == null) Array.empty else oneArrayOfNullableTexts)

}

object OneArrayOfNullableTexts_6Grid

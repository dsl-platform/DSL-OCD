package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneArrayOfNullableXmls_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneArrayOfNullableXmls: Array[Option[scala.xml.Elem]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableXmls") oneArrayOfNullableXmls: Array[Option[scala.xml.Elem]]
  ) =
    this(URI = URI, oneArrayOfNullableXmls = if (oneArrayOfNullableXmls == null) Array.empty else oneArrayOfNullableXmls)

}

object OneArrayOfNullableXmls_5Grid

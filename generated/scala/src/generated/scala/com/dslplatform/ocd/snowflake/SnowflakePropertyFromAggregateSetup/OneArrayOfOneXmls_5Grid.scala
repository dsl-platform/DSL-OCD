package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneArrayOfOneXmls_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneArrayOfOneXmls: Array[scala.xml.Elem]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneXmls") oneArrayOfOneXmls: Array[scala.xml.Elem]
  ) =
    this(URI = URI, oneArrayOfOneXmls = if (oneArrayOfOneXmls == null) Array.empty else oneArrayOfOneXmls)

}

object OneArrayOfOneXmls_5Grid

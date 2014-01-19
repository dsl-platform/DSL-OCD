package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneArrayOfOneMonies_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneArrayOfOneMonies: Array[BigDecimal]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneMonies") oneArrayOfOneMonies: Array[BigDecimal]
  ) =
    this(URI = URI, oneArrayOfOneMonies = if (oneArrayOfOneMonies == null) Array.empty else oneArrayOfOneMonies)

}

object OneArrayOfOneMonies_6Grid

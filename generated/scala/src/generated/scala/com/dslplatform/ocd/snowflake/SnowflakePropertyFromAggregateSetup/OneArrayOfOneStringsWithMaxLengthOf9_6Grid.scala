package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneArrayOfOneStringsWithMaxLengthOf9_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneArrayOfOneStringsWithMaxLengthOf9: Array[String]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneStringsWithMaxLengthOf9") oneArrayOfOneStringsWithMaxLengthOf9: Array[String]
  ) =
    this(URI = URI, oneArrayOfOneStringsWithMaxLengthOf9 = if (oneArrayOfOneStringsWithMaxLengthOf9 == null) Array.empty else oneArrayOfOneStringsWithMaxLengthOf9)

}

object OneArrayOfOneStringsWithMaxLengthOf9_6Grid

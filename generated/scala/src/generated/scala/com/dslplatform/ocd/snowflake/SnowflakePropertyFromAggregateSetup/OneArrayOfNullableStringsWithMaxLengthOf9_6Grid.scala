package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneArrayOfNullableStringsWithMaxLengthOf9_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneArrayOfNullableStringsWithMaxLengthOf9: Array[Option[String]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableStringsWithMaxLengthOf9") oneArrayOfNullableStringsWithMaxLengthOf9: Array[Option[String]]
  ) =
    this(URI = URI, oneArrayOfNullableStringsWithMaxLengthOf9 = if (oneArrayOfNullableStringsWithMaxLengthOf9 == null) Array.empty else oneArrayOfNullableStringsWithMaxLengthOf9)

}

object OneArrayOfNullableStringsWithMaxLengthOf9_6Grid

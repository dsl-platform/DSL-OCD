package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableStringWithMaxLengthOf9_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableStringWithMaxLengthOf9: Option[String]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableStringWithMaxLengthOf9") nullableStringWithMaxLengthOf9: Option[String]
  ) =
    this(URI = URI, nullableStringWithMaxLengthOf9 = nullableStringWithMaxLengthOf9)

}

object NullableStringWithMaxLengthOf9_5Grid

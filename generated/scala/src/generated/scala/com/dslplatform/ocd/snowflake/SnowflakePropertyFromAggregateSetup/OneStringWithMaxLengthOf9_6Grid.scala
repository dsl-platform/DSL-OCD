package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneStringWithMaxLengthOf9_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneStringWithMaxLengthOf9: String
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneStringWithMaxLengthOf9") oneStringWithMaxLengthOf9: String
  ) =
    this(URI = URI, oneStringWithMaxLengthOf9 = if (oneStringWithMaxLengthOf9 == null) "" else oneStringWithMaxLengthOf9)

}

object OneStringWithMaxLengthOf9_6Grid

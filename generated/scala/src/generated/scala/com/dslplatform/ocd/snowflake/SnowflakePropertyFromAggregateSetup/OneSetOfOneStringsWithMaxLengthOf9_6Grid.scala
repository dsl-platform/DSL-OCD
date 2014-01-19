package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneSetOfOneStringsWithMaxLengthOf9_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneSetOfOneStringsWithMaxLengthOf9: Set[String]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneStringsWithMaxLengthOf9") oneSetOfOneStringsWithMaxLengthOf9: Set[String]
  ) =
    this(URI = URI, oneSetOfOneStringsWithMaxLengthOf9 = if (oneSetOfOneStringsWithMaxLengthOf9 == null) Set.empty else oneSetOfOneStringsWithMaxLengthOf9)

}

object OneSetOfOneStringsWithMaxLengthOf9_6Grid

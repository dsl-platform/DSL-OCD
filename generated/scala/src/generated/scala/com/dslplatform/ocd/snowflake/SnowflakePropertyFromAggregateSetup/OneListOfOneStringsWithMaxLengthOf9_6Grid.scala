package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneListOfOneStringsWithMaxLengthOf9_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneListOfOneStringsWithMaxLengthOf9: IndexedSeq[String]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneStringsWithMaxLengthOf9") oneListOfOneStringsWithMaxLengthOf9: IndexedSeq[String]
  ) =
    this(URI = URI, oneListOfOneStringsWithMaxLengthOf9 = if (oneListOfOneStringsWithMaxLengthOf9 == null) IndexedSeq.empty else oneListOfOneStringsWithMaxLengthOf9)

}

object OneListOfOneStringsWithMaxLengthOf9_6Grid

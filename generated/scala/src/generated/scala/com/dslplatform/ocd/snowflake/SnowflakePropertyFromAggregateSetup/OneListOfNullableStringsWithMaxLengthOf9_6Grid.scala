package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneListOfNullableStringsWithMaxLengthOf9_6Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneListOfNullableStringsWithMaxLengthOf9: IndexedSeq[Option[String]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableStringsWithMaxLengthOf9") oneListOfNullableStringsWithMaxLengthOf9: IndexedSeq[Option[String]]
  ) =
    this(URI = URI, oneListOfNullableStringsWithMaxLengthOf9 = if (oneListOfNullableStringsWithMaxLengthOf9 == null) IndexedSeq.empty else oneListOfNullableStringsWithMaxLengthOf9)

}

object OneListOfNullableStringsWithMaxLengthOf9_6Grid

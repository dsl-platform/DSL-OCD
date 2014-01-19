package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableListOfOneStringsWithMaxLengthOf9_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableListOfOneStringsWithMaxLengthOf9: Option[IndexedSeq[String]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneStringsWithMaxLengthOf9") nullableListOfOneStringsWithMaxLengthOf9: Option[IndexedSeq[String]]
  ) =
    this(URI = URI, nullableListOfOneStringsWithMaxLengthOf9 = nullableListOfOneStringsWithMaxLengthOf9)

}

object NullableListOfOneStringsWithMaxLengthOf9_5Grid
